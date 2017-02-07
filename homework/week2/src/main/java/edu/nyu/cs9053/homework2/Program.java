package edu.nyu.cs9053.homework2;

/**
 * User: blangel
 * Date: 8/17/14
 * Time: 10:21 AM
 */
public class Program {

    public static void main(String[] args) {
        try{
        	if(args[0].equals("gps")){
                // create Gps object array
    			Gps[] gps = new Gps[(args.length - 1)];
    			for(int i = 1; i < args.length; i++){
    				String[] point = args[i].split(",");
    				gps[i - 1] = new Gps(Double.parseDouble(point[0]), Double.parseDouble(point[1]));
    			}
		    	PolylineEncoder polylineEncoder = new PolylineEncoder();
		    	System.out.println(polylineEncoder.encodePolyline(gps));       			
        	}

        	else if(args[0].equals("interest")){
        		//equals interest
				CompoundInterestCalculator interestCalculator =  new CompoundInterestCalculator();
        		if(args[1].equals("annual")){			    
			        System.out.println(interestCalculator.compoundAnnually(Double.parseDouble(args[2]), 
			        	Double.parseDouble(args[3]),Integer.parseInt(args[4]),Integer.parseInt(args[5])));
        		}
        		else if(args[1].equals("continuous")){
			        System.out.println(interestCalculator.continuousCompound(Double.parseDouble(args[2]),
			         Double.parseDouble(args[3]), Integer.parseInt(args[4])));
        		}
        		else{
        			System.out.println("Invalid argument");        			
        		}
        	}
            
        	else{
        		System.out.println("Invalid argument");
        	}
        }
        catch(Exception e){
        	System.out.println("Invalid argument");
        }
    }

}
