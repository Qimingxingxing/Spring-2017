package edu.nyu.cs9053.homework4.hierarchy;

public class Piccolo extends MusicalInstrument{
	private final static String origin = "Western Europe";
	private final static String hsNumber = "421.121.12";
	private final static String imageUrl = "https://en.wikipedia.org/wiki/Piccolo#/media/File:Yamaha_Piccolo_YPC-81.png";
	private final static String classificationName = "aerophones";

	private final String name;
	private final int age;

	public Piccolo(String name, int age){
		this.name = name;
		this.age = age;
	}

	public static String getOrigin(){
		return origin;
	}
	public static String getHsNumber(){
		return hsNumber;
	}	
	public static String getImageUrl(){
		return imageUrl;
	}
	public static String getClassificationName(){
		return classificationName;
	}

	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}

	@Override public boolean equals(Object o){
		if(this == o){
			return true;
		}

		if(o == null || getClass()!= o.getClass()){
			return false;
		}

		Piccolo that = (Piccolo) o;


		return(name == null ? (that.name == null) : name.equals(that.name))
			&& (age == that.getAge());
	}

	@Override public int hashCode(){
		final int HASHFACTOR = 31;
		int result = name != null ? name.hashCode() : 0;
		result = HASHFACTOR * result + Integer.valueOf(age).hashCode();
		return result;
	}
}