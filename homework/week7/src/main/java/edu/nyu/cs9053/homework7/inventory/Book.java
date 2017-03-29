package edu.nyu.cs9053.homework7.inventory;
public abstract class Book implements Item{
	private final double price;
	private final String title;

	protected Book(double price, String title){
		this.price = price;
		this.title = title;
	}
	@Override public Double getPrice(){
		return price;
	}
	public String getTitle(){
		return title;
	}

}