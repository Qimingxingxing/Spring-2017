package edu.nyu.cs9053.homework2;

/**
 * User: blangel
 * author: Qiming Zhang
 * Date: 8/17/14
 * Time: 9:02 AM
 *
 * Implements the Polyline Algorithm defined here
 * {@literal https://developers.google.com/maps/documentation/utilities/polylinealgorithm}
 */
public class PolylineEncoder {

    public String encodePolyline(Gps[] gpsPoints) {

    	String encodePolyline = "";
    	int lastLatitude = 0, lastLongitude = 0;
    	int gpsLatitudeInE5, gpsLongitudeInE5;

        for(Gps GpsElement: gpsPoints){
            // get the input latitude and longitude for each gps object
            // times 100000 and change it to integer
        	gpsLatitudeInE5 = (int)(GpsElement.getLatitude() * 100000);
        	gpsLongitudeInE5 =  (int)(GpsElement.getLongitude() * 100000);

            //calculate the changes
        	int latitudeChange = gpsLatitudeInE5 - lastLatitude;
        	int longitudeChange = gpsLongitudeInE5 - lastLongitude;

            //record the last location
        	lastLongitude = gpsLongitudeInE5;
        	lastLatitude = gpsLatitudeInE5;

            // call the encodedAlgorithm method
        	String encodeLatitude = encodedAlgorithm(latitudeChange);
        	String encodeLongitude = encodedAlgorithm(longitudeChange); 

            // append each output string to the final output
        	encodePolyline = encodePolyline + encodeLatitude + encodeLongitude;
        }
        return encodePolyline;
    }

     /**
     * @param initialSignedValue input number of change in longitude or latitude
     * @return encoded string
     */ 
    public static String encodedAlgorithm(int initialSignedValue){
        // shift left 1 bit
    	int valueInE5LeftShift = initialSignedValue << 1;

        // If the original decimal value is negative, invert this encoding
    	if(initialSignedValue < 0){
    		valueInE5LeftShift = ~valueInE5LeftShift;
    	} 

    	//32-bit of the encoding using signed extension
    	String valueInString = Extension(Integer.toBinaryString(valueInE5LeftShift), 0);
       
        //decide which point of the string is the first point that is not zero
        int firstNotZeroPoint = 0;
    	for(int i = 0; i<valueInString.length(); i++){
    		if(valueInString.charAt(i) == '1'){
    			firstNotZeroPoint = i;
    			break;
    		}
    	}
    	//now break it into 5-bit chunks, starting from right hand side
    	String[] fiveDigitChunks = new String[(31-firstNotZeroPoint)/5 +1 ];
        //take care of the scenerio when length is 7, which prevents from outofbound exception
        if(fiveDigitChunks.length == 7){
            valueInString = "000"+valueInString;
            for(int i = 0; i < fiveDigitChunks.length; i++){
                fiveDigitChunks[i] = valueInString.substring(35 - fiveDigitChunks.length * 5 +5*i, 35 - fiveDigitChunks.length * 5 + 5*i + 5);
            }
        }
        else{
        	for(int i= 0; i<fiveDigitChunks.length; i++){
        		fiveDigitChunks[i] = valueInString.substring(32 - fiveDigitChunks.length * 5 +5*i, 32 - fiveDigitChunks.length * 5 + 5*i + 5);
        	}
        }
    	//reverse chunks
    	String[] reverseDigitChunks = reverse(fiveDigitChunks);

    	// or 0x20
    	for(int i = 0; i < reverseDigitChunks.length; i++){
    		if(i == reverseDigitChunks.length - 1){
    			reverseDigitChunks[i] = "0" + reverseDigitChunks[i]; 
    		}
    		else{
    			reverseDigitChunks[i] = "1" + reverseDigitChunks[i];
    		}
    	}

    	//convert each value to decimal
    	int[] decimalChunks = new int[reverseDigitChunks.length];
    	for(int i = 0; i < decimalChunks.length; i++){
    		decimalChunks[i] = Integer.parseInt(reverseDigitChunks[i], 2) + 63;
    	}

    	// convert to ASCII 
    	String AsciiCode = "";
    	for(int decimal: decimalChunks){
    		AsciiCode += (char)decimal;
    	}
    	return AsciiCode;
    }

    /**
     * @param string array
     * @return encoded string
     */ 
    public static String[] reverse(String[] stringArray){
    	String[] reversedChunks = new String[stringArray.length];
    	for(int i = 0; i<stringArray.length;i++){
    		reversedChunks[stringArray.length - 1 - i] = stringArray[i];
    	}
    	return reversedChunks;
    }

    /**
     * @param s input string of bitset
     * @param zeroOrSign zero (0)or signed Extension(1)
     * @return 32 bit string
     */ 
    public static String Extension(String s, int zeroOrSign){
    	char firstChar = s.charAt(0);
    	String inputString = s;
    	if(zeroOrSign == 1){
	    	if(firstChar == '1'){
	    		for(int i = 0; i < (32 - inputString.length()); i++){
	    			s = "1" + s; 
	    		}
	    	}
	    	else{
	    		for(int i = 0; i < (32 - inputString.length()); i++){
	    			s = "0" + s; 
	    		}   		
	    	}
	    }
	    else{
    		for(int i = 0; i < (32 - inputString.length()); i++){
    			s = "0" + s; 
    		}
	    }
    	return s;
    }

    // class main method to test the class 
    public static void main(String[] args){
    	Gps gps1 = new Gps(38.5,-120.2);
    	Gps gps2 = new Gps(40.7,-120.95);
    	Gps gps3 = new Gps(43.252,-126.453);
    	Gps[] gpsArray = new Gps[3];
    	gpsArray[0] = gps1;
    	gpsArray[1] = gps2;
    	gpsArray[2] = gps3;
    	PolylineEncoder polylineEncoder = new PolylineEncoder();
    	System.out.println(polylineEncoder.encodePolyline(gpsArray));
    }
}
