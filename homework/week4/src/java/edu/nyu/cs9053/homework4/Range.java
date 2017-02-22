package edu.nyu.cs9053.homework4;

public enum Range{
	Soprano(261,880),
	Alto(196,698),
	Tenor(130,440),
	Baritone(97,350),
	Bass(16,256);

	private final int rangeLow;
	private final int rangeHigh;

	Range(int rangeLow, int rangeHigh){
		this.rangeHigh = rangeHigh;
		this.rangeLow = rangeLow;
	}

	public int getRangeLow(){
		return rangeLow;
	}

	public int getRangeHigh(){
		return rangeHigh;
	}
	public static void printRange(Range ... range){
		for(Range element : range){
			System.out.println("low frequency range is "+element.getRangeLow()+ 
				" high frequency range is "+element.getRangeHigh());
		}
	}
}