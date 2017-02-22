package edu.nyu.cs9053.homework4.hierarchy;

public abstract class MusicalInstrument{
	abstract public String getName();
	abstract public int getAge();

	@Override abstract public boolean equals(Object obj);
	@Override abstract public int hashCode();
}