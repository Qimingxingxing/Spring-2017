package edu.nyu.cs9053.homework11.network;

import edu.nyu.cs9053.homework11.game.Difficulty;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.*;

/**
 * User: blangel
 * Date: 11/15/15
 * Time: 3:31 PM
 *
 * A NIO implementation of a NetworkGameProvider.
 *
 * The server takes the following commands:
 * <pre>
 *     foes Difficulty
 * </pre>
 * <pre>
 *     move
 * </pre>
 * where the String "foes Easy" would be a call to {@linkplain NetworkGameProvider#getRandomNumberOfNextFoes(String)}
 * with "Easy"
 * and a call using String "move" would be a call to {@linkplain NetworkGameProvider#getRandomNextMove()}
 */
public class GameServer implements NetworkGameProvider, Runnable {

    public static final String SERVER_HOST = "localhost";
    public static final int SERVER_PORT = 8080;
    private final ByteBuffer inputBuffer;
    private final int BUFFERSIZE = 1024;
    private final Charset CHARSET = Charset.forName("UTF-8");
    private final Selector selector;
    private final ServerSocketChannel serverSocketChannel;
    // map the client socketchannel with the write inputBuffer
    private final Map<SocketChannel, ByteBuffer> map;
    private final Random RANDOM;

    public static void main(String[] args) throws IOException {
        GameServer server = new GameServer();
        server.run();
    }

    public GameServer() throws IOException {
    	RANDOM = new Random();
        map = new HashMap<>();
        inputBuffer = ByteBuffer.allocate(BUFFERSIZE);
        selector = Selector.open();
        serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.bind(new java.net.InetSocketAddress(SERVER_HOST, SERVER_PORT));
        serverSocketChannel.configureBlocking(false);
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
    }


    @Override
    public void run(){
        while (!Thread.currentThread().isInterrupted()) {
            try {
                int numberOfReadyChannels = selector.select();
                if (numberOfReadyChannels == 0) {
                    continue;
                }
                Set<SelectionKey> selectedKeys = selector.selectedKeys();
                Iterator<SelectionKey> keyIterator = selectedKeys.iterator();
                while (keyIterator.hasNext()) {
                    try {
                        SelectionKey key = keyIterator.next();
                        if (key.isAcceptable()) {
                            // accept the channel which is ready for new connection
                            SocketChannel clientChannel = serverSocketChannel.accept();
                            clientChannel.configureBlocking(false);
                            clientChannel.register(selector, SelectionKey.OP_READ | SelectionKey.OP_WRITE);
                            map.put(clientChannel, ByteBuffer.allocate(BUFFERSIZE));
                        }
                        else if (key.isReadable()) {
                            // when any channel is ready for read
                            inputBuffer.clear();
                            SocketChannel clientChannel = (SocketChannel) key.channel();
                            try {
                                clientChannel.read(inputBuffer);
                                String data = new String(inputBuffer.array(), CHARSET);
                                ByteBuffer writeBuffer = map.get(clientChannel);
                                if (!data.substring(0, 4).equals("Move")) {
                                    // if a call using String "Easy" would be a call to getRandomNextMove
                                    writeBuffer.put(ByteBuffer.wrap(getRandomNumberOfNextFoes(data).getBytes(CHARSET)));
                                    writeBuffer.put((byte) '\n');

                                } else {
                                    // if a call using String "move" would be a call to getRandomNextMove
                                    writeBuffer.put(ByteBuffer.wrap(getRandomNextMove().getBytes(CHARSET)));
                                    writeBuffer.put((byte) '\n');
                                }
                            }catch (Exception e) {
                                map.remove(clientChannel);
                                key.cancel();
                            }
                        }
                        else if (key.isWritable()) {
                        	// when the key is writeable, it will write the content in inputBuffer to client socket channel
                            SocketChannel clientChannel = (SocketChannel) key.channel();
                            ByteBuffer writeBuffer = map.get(clientChannel);
                            // if the writeBuffer is empty or null
                            if (writeBuffer == null || writeBuffer.position() == 0) {
                                continue;
                            }
                            // set the position to 0, start write to the channel
                            writeBuffer.flip();
                            clientChannel.write(writeBuffer);
                            writeBuffer.clear();
                        }
                    }
                    finally {
                    	// go to the next key
                        keyIterator.remove();
                    }
                }
            }
            catch (IOException ioe) {
                System.out.println("Something wrong! Program terminates");
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override
    public String getRandomNumberOfNextFoes(String difficulty) {
        // default value is easy
        if (difficulty == null) {
            return String.valueOf(RANDOM.nextInt(Difficulty.Easy.getLevel() + 1));
        }
        for (Difficulty dif: Difficulty.values()) {
            if (dif.name().equals(difficulty)) {
                return String.valueOf(RANDOM.nextInt(dif.getLevel() + 1));
            }
        }
        return String.valueOf(RANDOM.nextInt(Difficulty.Easy.getLevel() + 1));

    }

    @Override
    public String getRandomNextMove() {
        int move = RANDOM.nextInt(80);
        if (move < 20) {
            return "Up";
        }
        if (move >= 20 && move < 40) {
            return "Down";
        }
        if (move == 40 || move == 41) {
            return "Right";
        }
        else {
            return "Left";
        }
    }
}
