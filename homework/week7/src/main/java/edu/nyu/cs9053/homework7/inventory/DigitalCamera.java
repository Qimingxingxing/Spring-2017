package edu.nyu.cs9053.homework7.inventory;
public class DigitalCamera extends Camera{
	private final int zoom;
	public Camera(double price, int zoom){
		super(price);
		this.zoom = zoom;
	}

	public int getZoom(){
		return zoom;
	}
}