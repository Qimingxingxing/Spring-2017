package edu.nyu.cs9053.homework9;

import java.util.concurrent.Semaphore;

/**
 * User: blangel
 * Date: 4/3/16
 * Time: 2:18 PM
 */
public class ProducerConsumerFactory {
	private static final Semaphore semp = new Semaphore(1);

    public static Producer createProducer() {
		return new SeltzerProducer(semp);
    }

    public static Consumer createConsumer() {
		return new SeltzerConsumer(semp);
    }

}
