package edu.nyu.cs9053.homework5;

public class DrumMachine extends ElectronicInstruments{
	private final String name;
	private final int age;

	public DrumMachine(String name, int age){
		super("western Europe", null, "https://en.wikipedia.org/wiki/Drum_machine#/media/File:Yamaha_RY30_front.png");
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

		DrumMachine that = (DrumMachine) o;

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