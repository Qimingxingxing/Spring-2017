package edu.nyu.cs9053.homework7.inventory;

public class Cameraflash<T extends Camera> implements Item{
	private final double price;
	private final T camera;

	public Cameraflash(double price, T camera){
		this.price = price;
		this.camera = camera;
	}

	@Override public Double getPrice(){
		return price;
	}

	public T getCamera(){
		return camera;
	}
}
