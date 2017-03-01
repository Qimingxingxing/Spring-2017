package edu.nyu.cs9053.homework5;

public interface MusicalInstrument{

	// this method returns name of instrument as a string
    String getName();

    // this method returns age of instrument as a integer
	int getAge();

	// this method returns the address of imageUrl as a string
	String getImageUrl();

	// this method returns hsnumber as a integer
	String getHsNumber();

	// this method returns classification as a string
	String getClassificationName();

	// this method returns origin as a string
	String getOrigin();

	// this method accepts Rhythm object a Note object, and a NoteCallback function
	//  to print the actual sound of the instrument
	void play(Rhythm rhythm, Note note, NoteCallback noteCallback);

}
