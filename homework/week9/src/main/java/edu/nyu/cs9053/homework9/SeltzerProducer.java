package edu.nyu.cs9053.homework9;
import java.util.concurrent.Semaphore;
import java.util.Random;

public class SeltzerProducer implements Producer{
	private final Semaphore semp;
	public SeltzerProducer(){
		semp = new Semaphore(1);
	}
	@Override public Seltzer produce(VendingMachine into){
    	try{
    		semp.acquire();
    		if(into.atCapacity()) return null;
	    	Random random = new Random();
	        Flavor[] flavors = Flavor.values();
	        Seltzer seltzer = new Seltzer(flavors[random.nextInt(flavors.length)]);
	        into.add(seltzer);
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