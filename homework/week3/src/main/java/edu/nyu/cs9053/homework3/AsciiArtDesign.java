import java.util.*;
public class AsciiArtDesign{
	protected static final HashMap<Character, char[][]> hashmap = new HashMap<>();

	private char[][] charA = new char[][]{
		{' ',' ',' ',' ',' ',' ',' ',' ',' ','A',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ','A',' ','A',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ','A',' ',' ',' ','A',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ','A',' ',' ',' ',' ',' ','A',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ','A',' ','A',' ','A',' ','A',' ','A',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ','A',' ',' ',' ',' ',' ',' ',' ',' ',' ','A',' ',' ',' ',' ',' '},
		{' ',' ',' ','A',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','A',' ',' ',' ',' '},
		{' ',' ','A',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','A',' ',' ',' '},
		{' ','A',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','A',' ',' '},
		{'A',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','A',' '},
	};
	private char[][] charB = new char[][]{
		{' ','B','B','B','B','B','B','B','B','B','B',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ','B','B',' ',' ',' ',' ',' ',' ','B','B','B',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ','B','B',' ',' ',' ',' ',' ',' ',' ','B','B','B',' ',' ',' ',' ',' ',' ',' '},
		{' ','B','B',' ',' ',' ',' ',' ',' ','B','B','B',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ','B','B','B','B','B','B','B','B','B',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ','B','B',' ',' ',' ',' ',' ',' ','B','B','B',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ','B','B',' ',' ',' ',' ',' ',' ',' ','B','B','B',' ',' ',' ',' ',' ',' ',' '},
		{' ','B','B',' ',' ',' ',' ',' ',' ','B','B','B',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ','B','B','B','B','B','B','B','B','B','B',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
	};

	private char[][] charC = new char[][]{
		{' ',' ',' ',' ',' ','C','C','C','C','C',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ','C','C',' ',' ',' ','C','C','C',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ','C','C',' ',' ',' ',' ',' ','C','C','C',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ','C','C',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ','C','C','C',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ','C','C','C',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ','C','C',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ','C','C',' ',' ',' ',' ',' ','C','C','C',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ','C','C',' ',' ',' ','C','C','C',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ','C','C','C','C','C',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
	};
	private char[][] charD = new char[][]{
		{' ',' ','D','D','D','D','D','D',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ','D','D',' ',' ',' ','D','D',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ','D','D',' ',' ',' ',' ','D','D',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ','D','D',' ',' ',' ',' ',' ','D','D',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ','D','D',' ',' ',' ',' ',' ',' ','D','D',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ','D','D',' ',' ',' ',' ',' ',' ','D','D',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ','D','D',' ',' ',' ',' ',' ','D','D',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ','D','D',' ',' ',' ',' ','D','D',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ','D','D',' ',' ',' ','D','D',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ','D','D','D','D','D','D',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
	};

	private char[][] charE = new char[][]{
		{' ',' ','E','E','E','E','E','E','E','E','E','E','E',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ','E','E','E','E','E','E','E','E','E','E','E',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ','E','E','E',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ','E','E','E',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ','E','E','E','E','E','E','E','E','E','E','E',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ','E','E','E','E','E','E','E','E','E','E','E',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ','E','E','E',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ','E','E','E',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ','E','E','E','E','E','E','E','E','E','E','E',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ','E','E','E','E','E','E','E','E','E','E','E',' ',' ',' ',' ',' ',' ',' '},
	};

	private char[][] charF = new char[][]{
		{' ',' ','F','F','F','F','F','F','F','F','F','F','F','F','F',' ',' ',' ',' ',' '},
		{' ',' ','F','F','F','F','F','F','F','F','F','F','F','F','F',' ',' ',' ',' ',' '},
		{' ',' ','F','F','F',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ','F','F','F',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ','F','F','F','F','F','F','F','F','F','F','F','F','F',' ',' ',' ',' ',' '},
		{' ',' ','F','F','F','F','F','F','F','F','F','F','F','F','F',' ',' ',' ',' ',' '},
		{' ',' ','F','F','F',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ','F','F','F',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ','F','F','F',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ','F','F','F',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
	};

	private char[][] charG = new char[][]{
		{' ',' ',' ',' ',' ',' ','G','G','G','G','G','G','G',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ','G','G','G','G','G','G','G','G','G',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ','G','G','G',' ',' ',' ',' ',' ','G','G','G',' ',' ',' ',' ',' '},
		{' ',' ',' ','G','G','G',' ',' ',' ',' ',' ',' ',' ','G','G','G',' ',' ',' ',' '},
		{' ',' ','G','G','G',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ','G','G','G',' ',' ',' ',' ','G','G','G','G','G','G',' ',' ',' ',' '},
		{' ',' ',' ',' ','G','G','G',' ',' ',' ','G','G','G','G','G','G',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ','G','G',' ',' ',' ',' ',' ','G','G','G','G',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ','G','G','G','G','G','G','G','G',' ','G','G',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ','G','G','G','G','G','G',' ',' ','G','G',' ',' ',' ',' '},
	};
	private char[][] charH = new char[][]{
		{' ',' ',' ',' ',' ',' ','H','H',' ',' ',' ',' ',' ',' ',' ','H','H',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ','H','H',' ',' ',' ',' ',' ',' ',' ','H','H',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ','H','H',' ',' ',' ',' ',' ',' ',' ','H','H',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ','H','H',' ',' ',' ',' ',' ',' ',' ','H','H',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ','H','H','H','H','H','H','H','H','H','H','H',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ','H','H','H','H','H','H','H','H','H','H','H',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ','H','H',' ',' ',' ',' ',' ',' ',' ','H','H',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ','H','H',' ',' ',' ',' ',' ',' ',' ','H','H',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ','H','H',' ',' ',' ',' ',' ',' ',' ','H','H',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ','H','H',' ',' ',' ',' ',' ',' ',' ','H','H',' ',' ',' '},
	};

	private char[][] charI = new char[][]{
		{' ',' ',' ',' ',' ',' ','I','I','I','I','I','I',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ','I','I',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ','I','I',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ','I','I',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ','I','I',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ','I','I',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ','I','I',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ','I','I',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ','I','I',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ','I','I','I','I','I','I',' ',' ',' ',' ',' ',' ',' ',' '},
	};


	private char[][] charJ = new char[][]{
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','J','J','J',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','J',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','J',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','J',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','J',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','J',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ','J',' ','J',' ',' ',' ',' ','J',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ','J',' ','J',' ',' ',' ','J',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ','J',' ','J',' ',' ','J',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ','J',' ','J','J','J',' ',' ',' ',' ',' ',' ',' '},
	};
	private char[][] charK = new char[][]{
		{' ',' ',' ',' ',' ',' ','K',' ',' ',' ',' ',' ',' ',' ',' ',' ','K',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ','K',' ',' ',' ',' ',' ',' ',' ','K',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ','K',' ',' ',' ',' ',' ','K',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ','K',' ',' ',' ','K',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ','K',' ','K',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ','K',' ','K',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ','K',' ',' ',' ','K',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ','K',' ',' ',' ',' ',' ','K',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ','K',' ',' ',' ',' ',' ',' ',' ','K',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ','K',' ',' ',' ',' ',' ',' ',' ',' ',' ','K',' ',' ',' '},
	};

	private char[][] charL = new char[][]{
		{' ',' ',' ',' ',' ',' ','L',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ','L',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ','L',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ','L',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ','L',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ','L',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ','L',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ','L',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ','L',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ','L','L','L','L','L','L','L','L','L','L','L',' ',' ',' '},
	};


	private char[][] charM = new char[][]{
		{' ',' ',' ','M',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','M'},
		{' ',' ',' ','M',' ','M',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','M',' ','M'},
		{' ',' ',' ','M',' ',' ',' ','M',' ',' ',' ',' ',' ',' ',' ','M',' ',' ',' ','M'},
		{' ',' ',' ','M',' ',' ',' ',' ',' ','M',' ',' ',' ','M',' ',' ',' ',' ',' ','M'},
		{' ',' ',' ','M',' ',' ',' ',' ',' ',' ',' ','M',' ',' ',' ',' ',' ',' ',' ','M'},
		{' ',' ',' ','M',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','M'},
		{' ',' ',' ','M',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','M'},
		{' ',' ',' ','M',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','M'},
		{' ',' ',' ','M',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','M'},
		{' ',' ',' ','M',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','M'},
	};
	private char[][] charN = new char[][]{
		{' ',' ',' ','N',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','N'},
		{' ',' ',' ','N',' ','N',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','N'},
		{' ',' ',' ','N',' ',' ',' ','N',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','N'},
		{' ',' ',' ','N',' ',' ',' ',' ',' ','N',' ',' ',' ',' ',' ',' ',' ',' ',' ','N'},
		{' ',' ',' ','N',' ',' ',' ',' ',' ',' ',' ','N',' ',' ',' ',' ',' ',' ',' ','N'},
		{' ',' ',' ','N',' ',' ',' ',' ',' ',' ',' ',' ',' ','N',' ',' ',' ',' ',' ','N'},
		{' ',' ',' ','N',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','N',' ',' ',' ','N'},
		{' ',' ',' ','N',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','N',' ','N'},
		{' ',' ',' ','N',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','N'},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
	};

	private char[][] charO = new char[][]{
		{' ',' ',' ',' ',' ',' ',' ','O','O','O',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ','O',' ',' ',' ',' ',' ','O',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ','O',' ',' ',' ',' ',' ',' ',' ',' ',' ','O',' ',' ',' ',' ',' ',' '},
		{' ',' ','O',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','O',' ',' ',' ',' ',' '},
		{' ','O',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','O',' ',' ',' ',' '},
		{' ',' ','O',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','O',' ',' ',' ',' ',' '},
		{' ',' ',' ','O',' ',' ',' ',' ',' ',' ',' ',' ',' ','O',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ','O',' ',' ',' ',' ',' ','O',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ','O','O','O',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
	};


	private char[][] charP = new char[][]{
		{' ',' ',' ','P',' ','P',' ','P',' ','P',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ','P',' ',' ',' ',' ',' ',' ',' ','P',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ','P',' ',' ',' ',' ',' ',' ',' ',' ',' ','P',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ','P',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','P',' ',' ',' ',' ',' '},
		{' ',' ',' ','P',' ',' ',' ',' ',' ',' ',' ',' ',' ','P',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ','P',' ',' ',' ',' ',' ',' ',' ','P',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ','P',' ','P',' ','P',' ','P',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ','P',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ','P',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ','P',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
	};
	private char[][] charQ = new char[][]{
		{' ',' ',' ',' ',' ',' ',' ',' ','Q',' ','Q',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ','Q',' ',' ',' ',' ',' ',' ',' ','Q',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ','Q',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','Q',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ','Q',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','Q',' ',' ',' '},
		{' ',' ','Q',' ',' ',' ',' ',' ',' ',' ',' ','Q',' ',' ',' ',' ','Q',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','Q',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ','Q',' ',' ',' ',' ',' ',' ',' ',' ','Q',' ',' ','Q',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ','Q',' ',' ',' ',' ',' ',' ',' ','Q',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ','Q',' ','Q',' ',' ',' ','Q',' ',' ',' ',' ',' '},
	};

	private char[][] charR = new char[][]{
		{' ',' ',' ',' ','R',' ','R',' ','R',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ','R',' ',' ',' ',' ',' ',' ','R',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ','R',' ',' ',' ',' ',' ',' ',' ',' ','R',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ','R',' ',' ',' ',' ',' ',' ',' ',' ',' ','R',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ','R',' ',' ',' ',' ',' ',' ',' ',' ','R',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ','R',' ',' ',' ',' ',' ',' ','R',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ','R',' ','R',' ','R',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ','R',' ','R',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ','R',' ',' ',' ',' ','R',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ','R',' ',' ',' ',' ',' ',' ',' ','R',' ',' ',' ',' ',' ',' ',' '},
	};


	private char[][] charS = new char[][]{
		{' ',' ',' ',' ',' ',' ',' ',' ','S',' ','S',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ','S',' ',' ',' ',' ',' ',' ','S',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ','S',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ','S',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ','S',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ','S',' ',' ','S',' ','S',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','S',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','S',' ',' ',' ',' ',' ',' '},
		{' ',' ','S',' ',' ',' ',' ',' ',' ',' ',' ',' ','S',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ','S',' ',' ','S',' ','S',' ',' ',' ',' ',' ',' ',' ',' ',' '},
	};
	private char[][] charT = new char[][]{
		{' ',' ','T',' ','T',' ','T',' ','T','T','T',' ','T',' ','T',' ','T',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ','T',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ','T',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ','T',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ','T',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ','T',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ','T',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ','T',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ','T',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ','T',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
	};

	private char[][] charU = new char[][]{
		{' ',' ',' ',' ',' ','U',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','U',' ',' '},
		{' ',' ',' ',' ',' ','U',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','U',' ',' '},
		{' ',' ',' ',' ',' ','U',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','U',' ',' '},
		{' ',' ',' ',' ',' ','U',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','U',' ',' '},
		{' ',' ',' ',' ',' ','U',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','U',' ',' '},
		{' ',' ',' ',' ',' ','U',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','U',' ',' '},
		{' ',' ',' ',' ',' ','U',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','U',' ',' '},
		{' ',' ',' ',' ',' ',' ','U',' ',' ',' ',' ',' ',' ',' ',' ',' ','U',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ','U',' ',' ',' ',' ',' ','U',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','U',' ',' ',' ',' ',' ',' ',' ',' '},
	};


	private char[][] charV = new char[][]{
		{' ','V',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','V',' ',' '},
		{' ',' ','V',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','V',' ',' ',' '},
		{' ',' ',' ','V',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','V',' ',' ',' ',' '},
		{' ',' ',' ',' ','V',' ',' ',' ',' ',' ',' ',' ',' ',' ','V',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ','V',' ',' ',' ',' ',' ',' ',' ','V',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ','V',' ',' ',' ',' ',' ','V',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ','V',' ',' ',' ','V',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ','V',' ','V',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ','V',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
	};
	private char[][] charW = new char[][]{
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ','W',' ',' ',' ',' ',' ',' ',' ','W','W','W',' ',' ',' ',' ',' ',' ','W'},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ','W',' ',' ',' ',' ',' ','W',' ',' ',' ','W',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','W',' '},
		{' ',' ',' ',' ','W',' ',' ',' ','W',' ',' ',' ',' ',' ','W',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','W',' ',' '},
		{' ',' ',' ',' ',' ','W',' ','W',' ',' ',' ',' ',' ',' ',' ','W',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ','W',' ',' ',' ',' ',' ',' ',' ',' ',' ','W',' ',' ',' '},
	};

	private char[][] charX = new char[][]{
		{'X',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','X',' '},
		{' ',' ','X',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','X',' ',' ',' '},
		{' ',' ',' ',' ','X',' ',' ',' ',' ',' ',' ',' ',' ',' ','X',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ','X',' ',' ',' ',' ',' ','X',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ','X',' ','X',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ','X',' ','X',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ','X',' ',' ',' ',' ',' ','X',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ','X',' ',' ',' ',' ',' ',' ',' ',' ',' ','X',' ',' ',' ',' ',' '},
		{' ',' ','X',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','X',' ',' ',' '},
		{'X',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','X',' '},
	};


	private char[][] charY = new char[][]{
		{' ',' ','Y',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','Y',' '},
		{' ',' ',' ',' ','Y',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','Y',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ','Y',' ',' ',' ',' ',' ',' ',' ','Y',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ','Y',' ',' ',' ','Y',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','Y',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','Y',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','Y',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','Y',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','Y',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','Y',' ',' ',' ',' ',' ',' ',' ',' ',' '},
	};
	private char[][] charZ = new char[][]{
		{' ',' ',' ',' ',' ',' ','Z','Z',' ','Z',' ','Z',' ','Z',' ','Z',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','Z',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','Z',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','Z',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','Z',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','Z',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ','Z',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ','Z',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ','Z',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ','Z','Z',' ','Z',' ','Z',' ','Z',' ','Z',' ',' ',' ',' '},
	};

	private char[][] char1 = new char[][]{
		{' ',' ',' ',' ',' ',' ',' ',' ','1','1',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ','1',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ','1',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ','1',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ','1',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ','1',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ','1',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ','1',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ','1',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ','1','1','1','1','1','1','1','1','1',' ',' ',' ',' ',' ',' '},
	};

	private char[][] char2 = new char[][]{
		{' ',' ',' ',' ',' ',' ',' ',' ',' ','2',' ','2',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ','2',' ',' ',' ',' ',' ',' ',' ','2',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ','2',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','2',' ',' ',' '},
		{' ',' ',' ','2',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','2',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','2',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','2',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','2',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ','2',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ','2',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ','2',' ','2',' ','2',' ','2',' ','2',' ','2',' ','2',' ','2',' ',' '},
	};

	private char[][] char3 = new char[][]{
		{' ',' ',' ',' ','3',' ','3',' ','3',' ','3',' ','3',' ','3',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','3',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','3',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','3',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ','3',' ','3',' ','3',' ','3',' ','3',' ','3',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','3',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','3',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','3',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ','3',' ','3',' ','3',' ','3',' ','3',' ','3',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
	};

	private char[][] char4 = new char[][]{
		{' ',' ',' ',' ',' ',' ',' ',' ',' ','4','4',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ','4',' ','4',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ','4',' ',' ','4',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ','4',' ',' ',' ','4',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ','4',' ',' ',' ',' ','4',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ','4',' ',' ',' ',' ',' ','4',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ','4',' ','4',' ','4',' ','4','4','4',' ','4',' ','4',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','4',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','4',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','4',' ',' ',' ',' ',' ',' ',' ',' ',' '},
	};
	private char[][] char5 = new char[][]{
		{' ',' ',' ',' ',' ','5',' ','5',' ','5',' ','5',' ','5',' ','5',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ','5',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ','5',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ','5',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ','5',' ','5',' ','5',' ','5',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','5',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','5',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','5',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','5',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ','5',' ','5',' ','5',' ','5',' ',' ',' ',' ',' ',' ',' ',' '},
	};

	private char[][] char6 = new char[][]{
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','6',' ','6',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ','6',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ','6',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ','6',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ','6',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ','6',' ',' ',' ',' ',' ','6',' ',' ','6',' ','6',' ',' ',' ',' ',' ',' ',' '},
		{' ','6',' ',' ','6',' ',' ',' ',' ',' ',' ',' ',' ',' ','6',' ',' ',' ',' ',' '},
		{' ','6',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','6',' ',' ',' ',' '},
		{' ',' ','6',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','6',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ','6',' ',' ','6',' ',' ','6',' ',' ',' ',' ',' ',' ',' '},
	};

	private char[][] char7 = new char[][]{
		{' ','7',' ','7','7',' ','7',' ','7',' ','7',' ','7',' ','7',' ','7',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','7',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','7',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','7',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','7',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ','7',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ','7',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ','7',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ','7',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{'7',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
	};

	private char[][] char8 = new char[][]{
		{' ',' ',' ',' ',' ',' ',' ',' ','8',' ','8',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ','8',' ',' ',' ',' ',' ',' ',' ','8',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ','8',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','8',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ','8',' ',' ',' ',' ',' ',' ',' ','8',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ','8',' ','8',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ','8',' ',' ',' ',' ',' ',' ',' ','8',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ','8',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','8',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ','8',' ',' ',' ',' ',' ',' ',' ','8',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ','8',' ','8',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
	};

	private char[][] char9 = new char[][]{
		{' ',' ',' ',' ',' ',' ',' ',' ',' ','9',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ','9',' ',' ',' ',' ',' ','9',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ','9',' ',' ',' ',' ',' ',' ',' ',' ',' ','9',' ',' ',' ',' ',' '},
		{' ',' ',' ','9',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','9',' ',' ',' '},
		{' ',' ',' ',' ','9',' ',' ',' ',' ',' ',' ',' ',' ','9',' ',' ',' ','9',' ',' '},
		{' ',' ',' ',' ',' ',' ','9',' ',' ','9',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','9',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','9',' ',' ',' '},
		{' ',' ',' ',' ','9',' ',' ',' ',' ',' ',' ',' ',' ',' ','9',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ','9',' ',' ','9',' ',' ','9',' ',' ',' ',' ',' ',' ',' '},
	};

	private char[][] char0 = new char[][]{
		{' ',' ',' ',' ',' ',' ',' ','0','0','0',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ','0',' ',' ',' ',' ',' ','0',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ','0',' ',' ',' ',' ',' ',' ',' ',' ',' ','0',' ',' ',' ',' ',' ',' '},
		{' ',' ','0',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','0',' ',' ',' ',' ',' '},
		{' ','0',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','0',' ',' ',' ',' '},
		{' ',' ','0',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','0',' ',' ',' ',' ',' '},
		{' ',' ',' ','0',' ',' ',' ',' ',' ',' ',' ',' ',' ','0',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ','0',' ',' ',' ',' ',' ','0',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ','0','0','0',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
		{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
	};
	public AsciiArtDesign(){
		hashmap.put('A',charA);
		hashmap.put('B',charB);	
		hashmap.put('C',charC);
		hashmap.put('D',charD);
		hashmap.put('E',charE);
		hashmap.put('F',charF);
		hashmap.put('G',charG);	
		hashmap.put('H',charH);
		hashmap.put('I',charI);
		hashmap.put('J',charJ);
		hashmap.put('K',charK);
		hashmap.put('L',charL);	
		hashmap.put('M',charM);
		hashmap.put('N',charN);
		hashmap.put('O',charO);	
		hashmap.put('P',charP);
		hashmap.put('Q',charQ);	
		hashmap.put('R',charR);
		hashmap.put('S',charS);
		hashmap.put('T',charT);	
		hashmap.put('U',charU);	
		hashmap.put('V',charV);
		hashmap.put('W',charW);
		hashmap.put('X',charX);
		hashmap.put('Y',charY);	
		hashmap.put('Z',charZ);	

		hashmap.put('1',char1);	
		hashmap.put('2',char2);
		hashmap.put('3',char3);
		hashmap.put('4',char4);	
		hashmap.put('5',char5);	
		hashmap.put('6',char6);
		hashmap.put('7',char7);
		hashmap.put('8',char8);	
		hashmap.put('9',char9);	
		hashmap.put('0',char0);		
	}
}