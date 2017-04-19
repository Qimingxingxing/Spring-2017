package edu.nyu.cs9053.homework10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * User: blangel
 * Date: 4/12/16
 * Time: 7:27 PM
 */
public class ModernFortification extends AbstractFortification implements Fortification<ExecutorService>{
    private final ExecutorService pool;
    public ModernFortification(int concurrentFactor){
        super(concurrentFactor);
        this.pool = Executors.newFixedThreadPool(concurrentFactor);
    }
    @Override
    public void handleAttack(AttackHandler handler){
        for (int i = 0 ; i < getConcurrencyFactor(); i ++ ) {
            pool.submit(new Runnable(){
                @Override
                public void run(){
                    handler.soldiersReady();
                }
            });
        }
    }
    @Override
    public void surrender() {
        pool.shutdown();
    }
}
