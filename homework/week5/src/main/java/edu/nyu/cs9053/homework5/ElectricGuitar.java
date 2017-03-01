package edu.nyu.cs9053.homework5;

public class ElectricGuitar extends Guitar{
	private final String name;
	private final int age;

	public ElectricGuitar(String name, int age){
		super("Spain, et al", "3", "https://en.wikipedia.org/wiki/Electric_guitar#/media/File:Gibson_Les_Paul_54_Custom.jpg");
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

		ElectricGuitar that = (ElectricGuitar) o;

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