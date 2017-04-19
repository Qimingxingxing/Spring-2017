package edu.nyu.cs9053.homework10;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * User: blangel
 * Date: 4/12/16
 * Time: 7:28 PM
 */
public class MiddleAgesFortification extends AbstractFortification implements Fortification<Thread> {
    private final BlockingQueue<Runnable> queue;
    private final Thread[] threads;
    public MiddleAgesFortification(int concurrentFactor) {
        super(concurrentFactor);
        queue = new ArrayBlockingQueue<Runnable>(concurrentFactor);
        threads = new Thread[concurrentFactor];
        processThreads();
    }
    public void processThreads(){
        for (int i = 0; i < getConcurrencyFactor(); i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (!Thread.currentThread().isInterrupted()){
                        try{
                            Runnable handle = queue.take();
                            handle.run();
                        }catch (InterruptedException e){
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            });
            threads[i].start();
        }
    }
    @Override
    public void handleAttack(AttackHandler handler) {
        try {
            queue.put(new Runnable() {
                @Override
                public void run() {
                    handler.soldiersReady();
                }
            });
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void surrender() {
        for(Thread thread: threads){
            if(thread!= null){
                thread.interrupt();
            }
        }
    }
}
