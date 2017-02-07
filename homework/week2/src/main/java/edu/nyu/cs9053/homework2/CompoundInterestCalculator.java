package edu.nyu.cs9053.homework2;

import java.math.BigDecimal;
import static java.lang.System.out;
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
        BigDecimal bigPrincipal = new BigDecimal(principal);
        BigDecimal bigRate = new BigDecimal(rate);
        BigDecimal base = BigDecimal.valueOf(1).add(bigRate.divide(BigDecimal.valueOf(periods)));
        return (bigPrincipal.multiply(base.pow(periods*years))).subtract(bigPrincipal); 
    }

    /**
     * @param principal principal amount
     * @param rate annual interest rate (not in percentage; i.e., 3.1% would be passed in as 0.031)
     * @param years the number of years to calculate
     * @return the amount of interest calculated after {@code years} (excludes the {@code principal})
     * @see {@literal http://en.wikipedia.org/wiki/Compound_interest#Continuous_compounding}
     */
    public BigDecimal continuousCompound(double principal, double rate, int years) {
        BigDecimal bigPrincipal = new BigDecimal(principal);
        BigDecimal bigRate = new BigDecimal(rate);
        double e = Math.E;
        double power = (rate * years);
        return  bigPrincipal.multiply(BigDecimal.valueOf(Math.exp(power))).subtract(bigPrincipal);
    }
    //class test main 
    public static void main(String[] args){
         CompoundInterestCalculator a =  new CompoundInterestCalculator();
         out.println(a.compoundAnnually(1500, 0.043, 4 ,6));

         out.println(a.continuousCompound(2340, 0.031, 3));
    }

}
