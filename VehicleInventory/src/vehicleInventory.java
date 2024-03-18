import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
public class vehicleInventory {

	public static ArrayList<automobile> inventory = new ArrayList<automobile>();
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		//"Call automobile class with parameterized constructor (e.g., "make, model, color, year, mileage")."
		automobile car1 = new automobile("Nissan", "Leaf", "White", 2012, 15000);
		inventory.add(new automobile("Nissan", "Leaf", "White", 2012, 15000));
		inventory.add(new automobile());
		
		//"Then call the method to list the values. Loop through the array and print to the screen."
		for (int i = 0; i < 5; i++) {
			System.out.println(">" + inventory.get(0).getInfo()[i]);
		}
		//Demonstration compared to output with loop^
		printInfo(inventory.get(0));
		//printInfo(car1);
		printInventory();
		
		//"Call the remove vehicle method to clear the variables"
		car1.removeVehicle();
		
		//"Add a new vehicle."
		//This should be using an 'add new vehicle' method. Gets user input
		//Should be in vehicleInventory. Adds new vehicle to arraylist
		automobile car2 = new automobile();
		printInfo(car2);
		
		//"Update the vehicle... Call the listing method and print the information to the screen."
		car2.updateInfo("Toyota", "Corolla", "Silver", 2007, 23000);
		printInfo(car2);
		car2.updateInfo(2, "Grey");
		printInfo(car2);
		
		//"Display a message asking if the user wants to print the information to a file (Y or N)."
		System.out.println("Would you like to print the information to a file? (Y/N):");
		String userInput = scnr.next();
		switch (userInput) {
		case "Y":
		case "y":
			System.out.println("Y: Printing information to [placeholder].txt...");
			break;
		case "N":
		case "n":
			System.out.println("N: Information will not be printed to file.");
			break;
		default:
			System.out.println("Invalid selection: Information will not be printed to file.");
		}
		
		scnr.close();
	}
	
	//Takes automobile input, prints String output of organized info using list method
	public static void printInfo(automobile inputCar) {
		try {
			String output = ">" + inputCar.getInfo()[3] + " " + inputCar.getInfo()[0] + " " + inputCar.getInfo()[1] + ", " + inputCar.getInfo()[2] + ", " + inputCar.getInfo()[4] + " miles";
			System.out.println(output);
			System.out.println("printInfo(automobile) success");
		}
		catch (Exception excpt) {
			System.out.println(excpt.getMessage());
			System.out.println("printInfo(automobile) failed");
		}
	}
	
	public static void printInventory() {
		try {
			for(int i = 0; i < inventory.size(); i++) {
				printInfo(inventory.get(i));
			}
			System.out.println("printInventory() success");
		}
		catch (Exception excpt){
			System.out.println("printInventory() failed");
		}
	}
	
	public static void addNewVehicle() {
		
	}
}
