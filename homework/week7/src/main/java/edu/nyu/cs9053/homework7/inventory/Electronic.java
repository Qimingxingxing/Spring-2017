package edu.nyu.cs9053.homework7.inventory;
public abstract class Electronic implements Item{
	private final double price;

	protected Electronic(double price){
		this.price = price;
	}
	@Override public Double getPrice(){
		return price;
	}
}