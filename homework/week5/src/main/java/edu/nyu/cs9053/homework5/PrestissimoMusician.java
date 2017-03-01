package edu.nyu.cs9053.homework5;

import java.util.*;
public class PrestissimoMusician implements Musician{
	private final static Random random = new Random();
	private final static int max = 220;
	private final static int min = 200;
	private final static long tempo = random.nextInt(max) % (max - min + 1) + min; 

	@Override 
    public void playDitty(DittyCallback dittyCallback, MusicalInstrument instrument, Note ... notes){
    	// set the duration of actual note played
		final long thirtySecondsMs = 30_000;
		final double scale = 100d;
        long millisecondsPause = thirtySecondsMs / notes.length;
        double conversion = (scale / (double) tempo);
        final long expectedMs = (long) (millisecondsPause * conversion);    	

    	for(Note note: notes){
    		Rhythm rhythm = new Rhythm(){
                @Override public long getDuration() {
                    return (expectedMs); 
                }   			
    		};
    		instrument.play(rhythm, note, new NoteCallback(){
                @Override public void notePlayed(Note note) {
    				dittyCallback.notePlayed(note);
                }
    		});
    	}
    }

    @Override 
	public long getTempo(){
		return tempo;
	}
}