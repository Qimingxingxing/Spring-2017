package edu.nyu.cs9053.homework7.inventory;

public class BookShelf<T extends Book> implements Item{
	private final double price;
	private final T book;

	public BookShelf(double price, T book){
		this.price = price;
		this.book = book;
	}

	@Override public Double getPrice(){
		return price;
	}

	public T getBook(){
		return book;
	}
}
