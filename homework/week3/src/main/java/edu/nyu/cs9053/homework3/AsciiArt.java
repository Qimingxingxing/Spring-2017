public class AsciiArt{

	public static void main(String[] args){
		try{
			String input = args[0];
			if(args.length != 1){
				throw new Exception("Invalid input!");
			}

			if(checkInput(input)){
				Letter letter = new Letter(input.charAt(0));
				letter.print();
			}
			else{
				System.out.println("unknown character");
			}

		}
		catch(Exception e){
			System.out.println("Invalid input!");
		}	
	}

	public static boolean checkInput(String input){
		if(input.length()!= 1){
			return false;
		}
		String expectedInput = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i=0; i<expectedInput.length();i++){
			if(input.charAt(0) == expectedInput.charAt(i)){
				return true;
			}
		}
		return false;

	}
}