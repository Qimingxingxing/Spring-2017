package edu.nyu.cs9053.homework5;

public class Clarinet extends Aerophones{
	private final String name;
	private final int age;

	public Clarinet(String name, int age){
		super("Germany","422.2","https://en.wikipedia.org/wiki/Clarinet#/media/File:Yamaha_Clarinet_YCL-457II-22.tiff" );
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

		Clarinet that = (Clarinet) o;


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