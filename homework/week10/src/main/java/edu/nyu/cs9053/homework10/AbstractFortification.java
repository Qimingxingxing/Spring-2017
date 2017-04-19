package edu.nyu.cs9053.homework10;

import java.util.concurrent.ExecutorService;

public abstract class AbstractFortification implements ConcurrencyFactorProvider{
    private final int concurrentFactor;
	public AbstractFortification(int concurrentFactor){
		this.concurrentFactor = concurrentFactor;
	}
	@Override
    public int getConcurrencyFactor() {
        return concurrentFactor;
    }
}