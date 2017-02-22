package edu.nyu.cs9053.homework4.hierarchy;

public class KeyBoard extends MusicalInstrument{
	private final static String origin = "western EU";
	private final static String hsNumber = null;
	private final static String imageUrl = "https://en.wikipedia.org/wiki/Keyboard_instrument#/media/File:D274.jpg";
	private final static String classificationName = null;

	private final String name;
	private final int age;

	public KeyBoard(String name, int age){
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

		KeyBoard that = (KeyBoard) o;

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