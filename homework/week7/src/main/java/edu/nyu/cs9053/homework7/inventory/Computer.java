package edu.nyu.cs9053.homework7.inventory;
public class Computer extends Electronic{
	private final double ghz;
	public Computer(double price, double ghz){
		super(price);
		this.ghz = ghz;
	}
	public double getGhz(){
		return ghz;
	}
}