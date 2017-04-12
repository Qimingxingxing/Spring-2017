package edu.nyu.cs9053.homework9;
import java.util.concurrent.Semaphore;

public class SeltzerConsumer implements Consumer{
	private final Semaphore semp;
	public SeltzerConsumer(Semaphore semp){
		this.semp = semp;
	}
    @Override public Seltzer consume(VendingMachine from){
    	try{
    		semp.acquire();
    		if(from.isEmpty()) return null;
	    	Seltzer seltzer = from.remove();
	    	return seltzer;
    	}
    	catch(InterruptedException e){
    		Thread.currentThread().interrupt();
    		throw new RuntimeException(e);
    	}
    	finally{
    		semp.release();
    	}
    }
}