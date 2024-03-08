import java.util.Scanner;
public class vehicleInventory {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		//"Call automobile class with parameterized constructor (e.g., "make, model, color, year, mileage")."
		automobile car1 = new automobile("Nissan", "Leaf", "White", 2012, 15000);
		
		//"Then call the method to list the values. Loop through the array and print to the screen."
		for (int i = 0; i < 5; i++) {
			System.out.println(">" + car1.getInfo()[i]);
		}
		//Demonstration compared to output with loop^
		printInfo(car1);
		
		//"Call the remove vehicle method to clear the variables"
		car1.removeVehicle();
		
		//"Add a new vehicle."
		//This should be using an 'add new vehicle' method. How is that different from a constructor?
		//Should the method be in automobile or vehicleInventory? Should I be putting these in an array?
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
			System.out.println("Y: Printing information to [placeholder].txt...");
			break;
		case "N":
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
}
