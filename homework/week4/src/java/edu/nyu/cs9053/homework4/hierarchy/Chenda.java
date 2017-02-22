package edu.nyu.cs9053.homework4.hierarchy;

public class Chenda extends MusicalInstrument{
	private final static String origin = "India";
	private final static String hsNumber = "211.212";
	private final static String imageUrl = "https://en.wikipedia.org/wiki/Chenda#/media/File:Chendaa.jpg";
	private final static String classificationName = "membranophones";

	private final String name;
	private final int age;

	public Chenda(String name, int age){
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

		Chenda that = (Chenda) o;

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