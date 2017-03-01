package edu.nyu.cs9053.homework5;

public abstract class Chordophones implements MusicalInstrument{
	protected final String origin;
	protected final String hsNumber;
	protected final String imageUrl;

	public Chordophones(String origin, String hsNumber, String imageUrl){
		this.origin = origin;
		this.hsNumber = hsNumber;
		this.imageUrl = imageUrl;
	}
	private final static String classificationName = "Chordophones";

	@Override public String getOrigin(){
		return origin;
	}
	@Override public String getHsNumber(){
		return hsNumber;
	}	
	@Override public String getImageUrl(){
		return imageUrl;
	}
	@Override public String getClassificationName(){
		return classificationName;
	}
}