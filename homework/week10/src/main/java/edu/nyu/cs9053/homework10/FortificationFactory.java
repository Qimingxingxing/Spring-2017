package edu.nyu.cs9053.homework10;

import java.util.concurrent.ExecutorService;

/**
 * User: blangel
 * Date: 4/12/16
 * Time: 7:31 PM
 */
public class FortificationFactory {

    public static Fortification<Thread> createMiddleAges(int concurrencyFactor) {
    	Fortification<Thread> fortification = new MiddleAgesFortification(concurrencyFactor);
        return fortification; 
    }

    public static Fortification<ExecutorService> createModern(final int concurrencyFactor) {
    	Fortification<ExecutorService> fortification = new ModernFortification(concurrencyFactor);
        return fortification;
    }

}
