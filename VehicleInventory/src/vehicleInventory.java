import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
public class vehicleInventory {

	public static ArrayList<automobile> inventory = new ArrayList<automobile>();
	public static Scanner scnr = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//"Call automobile class with parameterized constructor (e.g., "make, model, color, year, mileage")."
		//automobile car1 = new automobile("Nissan", "Leaf", "White", 2012, 15000);
		inventory.add(new automobile("Nissan", "Leaf", "White", 2012, 15000));
		//inventory.add(new automobile());
		
		//"Then call the method to list the values. Loop through the array and print to the screen."
		for (int i = 0; i < 5; i++) {
			System.out.println(">" + inventory.get(0).getInfo()[i]);
		}
		//Demonstration compared to output with loop^
		printInfo(inventory.get(0));
		
		//"Call the remove vehicle method to clear the variables"
		//car1.removeVehicle();
		//inventory.remove(0);
		deleteVehicle();
		
		//"Add a new vehicle."
		addNewVehicle();
		printInventory();
		
		//"Update the vehicle... Call the listing method and print the information to the screen."
		//car2.updateInfo("Toyota", "Corolla", "Silver", 2007, 23000);
		//printInfo(car2);
		//car2.updateInfo(2, "Grey");
		//printInfo(car2);
		
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
			//System.out.println("Automobile info printed");
		}
		catch (Exception excpt) {
			System.out.println(excpt.getMessage());
			System.out.println("printInfo(automobile) failed");
		}
	}
	
	//Prints info of every vehicle in inventory array
	public static void printInventory() {
		try {
			for(int i = 0; i < inventory.size(); i++) {
				printInfo(inventory.get(i));
			}
			System.out.println("Inventory printed");
		}
		catch (Exception excpt){
			System.out.println(excpt.getMessage());
			System.out.println("printInventory() failed");
		}
	}
	
	//Takes user input information and stores it in a new vehicle in the array
	public static void addNewVehicle() {
		try {
			System.out.println("Input new vehicle make: ");
			String makeInput = scnr.next();
			System.out.println("Input new vehicle model: ");
			String modelInput = scnr.next();
			System.out.println("Input new vehicle color: ");
			String colorInput = scnr.next();
			System.out.println("Input new vehicle year: ");
			int yearInput = scnr.nextInt();
			System.out.println("Input new vehicle mileage: ");
			int mileageInput = scnr.nextInt();
			inventory.add(new automobile(makeInput, modelInput, colorInput, yearInput, mileageInput));
			System.out.println("New vehicle successfully added.");
		}
		catch(Exception excpt) {
			System.out.println(excpt.getMessage());
			System.out.println("Failed to add new vehicle.");
		}
	}
	
	//Returns array index value of vehicle that matches inputs
	public static int findVehicle() {	
		int output = -1;
		try {
			System.out.println("Input vehicle make: ");
			String makeInput = scnr.next();
			System.out.println("Input vehicle model: ");
			String modelInput = scnr.next();
			System.out.println("Input vehicle color: ");
			String colorInput = scnr.next();
			System.out.println("Input vehicle year: ");
			int yearInput = scnr.nextInt();
			System.out.println("Input vehicle mileage: ");
			int mileageInput = scnr.nextInt();
			for (int i = 0; i < inventory.size(); i++) {
				if(inventory.get(i).checkInfo(makeInput, modelInput, colorInput, yearInput, mileageInput)) {
					output = i;
				}
			}
		}
		catch(Exception excpt) {
			System.out.println(excpt.getMessage());
			System.out.println("findVehicle() failed");
			output = -1;
		}
		return output;
	}
	
	//Calls findVehicle() and deletes the vehicle matching user input info
	public static void deleteVehicle() {
		try {
			int i = -1;
			System.out.println("Please input the information of the vehicle you wish to DELETE");
			i = findVehicle();
			if (i == -1) {
				System.out.println("Vehicle not found, deletion failed.");
			}else {
				inventory.remove(i);
				System.out.println("Vehicle successfully deleted.");
			}
		}
		catch(Exception excpt) {
			System.out.println(excpt.getMessage());
			System.out.println("Failed to delete vehicle.");
		}
	}
	
	public static void updateVehicle() {
		try {
			int i = -1;
			System.out.println("Please input the information of the vehicle you wish to UPDATE");
			i = findVehicle();
			inventory.remove(i);
			System.out.println("Vehicle successfully deleted.");
		}
		catch(Exception excpt) {
			
		}
	}
}
