package edu.nyu.cs9053.homework2;

import java.math.BigDecimal;

/**
 * User: blangel
 * Date: 8/17/14
 * Time: 9:22 AM
 *
 * Calculates interest annually and continuously.
 */
public class CompoundInterestCalculator {

    /**
     * @param principal principal amount
     * @param rate nominal annual interest rate (not reflecting the compounding) (not in percentage; i.e., 3.1% would be passed in as 0.031)
     * @param periods number of times the interest is compounded per year
     * @param years the number of years the {@code principal} is borrowed
     * @return the amount of interest calculated (excludes the {@code principal})
     * @see {@literal http://en.wikipedia.org/wiki/Compound_interest#Compound_Interest}
     */
    public BigDecimal compoundAnnually(double principal, double rate, int periods, int years) {
	// TODO - implement
    }

    /**
     * @param principal principal amount
     * @param rate annual interest rate (not in percentage; i.e., 3.1% would be passed in as 0.031)
     * @param years the number of years to calculate
     * @return the amount of interest calculated after {@code years} (excludes the {@code principal})
     * @see {@literal http://en.wikipedia.org/wiki/Compound_interest#Continuous_compounding}
     */
    public BigDecimal continuousCompound(double principal, double rate, int years) {
	// TODO - implement
    }

}
