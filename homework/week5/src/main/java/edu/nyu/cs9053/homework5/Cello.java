package edu.nyu.cs9053.homework5;

public class Cello extends Chordophones{

	private final String name;
	private final int age;

	public Cello(String name, int age){
		super("Italy","321.322-71","https://en.wikipedia.org/wiki/Cello#/media/File:Cello_front_side.png");
		this.name = name;
		this.age = age;
	}


	@Override public String getName(){
		return name;
	}
	@Override public int getAge(){
		return age;
	}
	@Override public void play(Rhythm rhythm, Note note, NoteCallback noteCallback){
		rhythm.perform();
		noteCallback.notePlayed(note);
	}
	@Override public boolean equals(Object o){
		if(this == o){
			return true;
		}

		if(o == null || getClass()!= o.getClass()){
			return false;
		}

		Cello that = (Cello) o;

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