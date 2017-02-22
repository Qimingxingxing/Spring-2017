package edu.nyu.cs9053.homework4.hierarchy;

public class Sitar extends MusicalInstrument{
	private final static String origin = "Persia, India, Pakistan and other countries";
	private final static String hsNumber = "3";
	private final static String imageUrl = "https://en.wikipedia.org/wiki/Sitar#/media/File:Sitar_full.jpg";
	private final static String classificationName = "chordophones";

	private final String name;
	private final int age;

	public Sitar(String name, int age){
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

		Sitar that = (Sitar) o;

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