import java.io.*;
import java.util.Scanner;
public class vehicleInventory {
	
	public static int inventorySize = 0;
	public static automobile[] inventory = new automobile[100];

	public static void main(String[] args) {
		
		//inventory[0] = new automobile("Nissan","Leaf","White",2012,10000);
		//inventory[1] = new automobile();
		//inventorySize = 2;
		
		addVehicle();
		addVehicle();
		addVehicle("Nissan", "Leaf", "White", 2012, 10000);
		
		//System.out.println(inventory[0].getInfo());
		//System.out.println(inventory[1].getInfo());
		
		System.out.println();
	}
	
	//This method returns String array of inventory[] without the empty array spaces
	//Can be used to check inventory size
	public static String[] inventoryList() {
		String[] list = new String[inventorySize];
		for (int i = 0; i < inventorySize; i++) {
			list[i] = inventory[i].getInfo();
		}
		return list;
	}
	
	//Add blank vehicle
	public static void addVehicle() {
		inventory[inventorySize] = new automobile();
		inventorySize++;
	}
	//Add constructed vehicle
	public static void addVehicle(String newMake, String newModel, String newColor, int newYear, int newMileage) {
		inventory[inventorySize] = new automobile(newMake, newModel, newColor, newYear, newMileage);
		inventorySize++;
	}
	//Remove vehicle
	public static void removeVehicle(int slot) {
		
	}
}
