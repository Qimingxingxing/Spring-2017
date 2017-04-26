package edu.nyu.cs9053.homework11.network;

import edu.nyu.cs9053.homework11.game.Difficulty;
import edu.nyu.cs9053.homework11.game.GameProvider;
import edu.nyu.cs9053.homework11.game.screen.InputMove;

import java.io.*;
import java.net.Socket;
import java.nio.charset.Charset;

/**
 * User: blangel
 * Date: 11/15/15
 * Time: 3:32 PM
 *
 * A blocking IO implementation of a client which requests moves from a remote server implementing the
 * {@linkplain edu.nyu.cs9053.homework11.network.NetworkGameProvider}
 */
public class GameClient implements GameProvider {

    private final Difficulty difficulty;
    private static final Charset CHARSET = Charset.forName("UTF-8");
    private final InputStream clientInput;
    private final OutputStream clientOutput;
    
    public static GameClient construct(Difficulty difficulty) {
        try {
            Socket socket = new Socket(GameServer.SERVER_HOST, GameServer.SERVER_PORT);
            return new GameClient(socket.getInputStream(), socket.getOutputStream(), difficulty);
        } catch (IOException ioe) {
            System.out.println("construct client failed!");
            throw new RuntimeException(ioe);
        }
    }

    public GameClient(InputStream clientInput, OutputStream clientOutput, Difficulty difficulty) {
        this.clientInput = clientInput;
        this.clientOutput = clientOutput;
        this.difficulty = difficulty;
    }

    @Override
    public int getRandomNumberOfNextFoes() {
        int numberOfNextFoes = 0;
        try {
            clientOutput.write(getDifficulty().name().getBytes(CHARSET));
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(clientInput));
            numberOfNextFoes = Integer.parseInt(inputReader.readLine());
        } catch (IOException ioe) {
            System.out.println("Get num of next foes failed!");
        }
        return numberOfNextFoes;

    }
    @Override
    public InputMove getRandomNextMove() {
        InputMove nextMove = null;
        try {
            clientOutput.write("Move".getBytes(CHARSET));
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(clientInput));
            nextMove = InputMove.valueOf(inputReader.readLine());
        } catch (IOException ioe) {
            System.out.println("get next move failed");
        }
        return nextMove;
    }

    @Override
    public Difficulty getDifficulty() {
        return difficulty;
    }
}
