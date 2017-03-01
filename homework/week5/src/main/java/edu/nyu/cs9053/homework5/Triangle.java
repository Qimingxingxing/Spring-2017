package edu.nyu.cs9053.homework5;

public class Triangle extends Idiophones{
	private final String name;
	private final int age;

	public Triangle(String name, int age){
		super(null, "111.2", "https://en.wikipedia.org/wiki/List_of_musical_instruments#/media/File:Triangle_001.jpg");
		this.name = name;
		this.age = age;
	}

	@Override public void play(Rhythm rhythm, Note note, NoteCallback noteCallback){
		rhythm.perform();
		noteCallback.notePlayed(note);
	}

	@Override public String getName(){
		return name;
	}
	@Override public int getAge(){
		return age;
	}

	@Override public boolean equals(Object o){
		if(this == o){
			return true;
		}

		if(o == null || getClass()!= o.getClass()){
			return false;
		}

		Triangle that = (Triangle) o;

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