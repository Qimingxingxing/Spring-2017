package edu.nyu.cs9053.homework7;
import edu.nyu.cs9053.homework7.inventory.*;
import java.util.*;
/**
 * User: blangel
 * Date: 10/13/14
 * Time: 1:58 PM
 */
public class WarehouseInventoryAuditor {

    // TODO - create a method to print the individual prices of a Bin of any Item type
	public <T extends Item> void printItemPrice(Bin<T> items){
		Iterator<T> iter = items.iterator();
		while(iter.hasNext()){
			T element = iter.next();
			System.out.println(element.getPrice());
		}
	}
    // TODO - create a method to print the individual prices of a Bin of any Electronic types
	public <T extends Electronic> void printElectronicPrice(Bin<T> items){
		Iterator<T> iter = items.iterator();
		while(iter.hasNext()){
			T element = iter.next();
			System.out.println(element.getPrice());
		}
	}
    // TODO - create a method to print the individual prices of a Bin of any Book types
	public <T extends Book> void printBookPrice(Bin<T> items){
		Iterator<T> iter = items.iterator();
		while(iter.hasNext()){
			T element = iter.next();
			System.out.println(element.getPrice());
		}
	}
}
