import java.util.Scanner;

public class vehicleInventory {

	public static void main(String[] args) {
		
		//"Call automobile class with parameterized constructor (e.g., "make, model, color, year, mileage")."
		automobile car1 = new automobile("Nissan", "Leaf", "White", 2012, 10000);
		
		//"Then call the method to list the values. Loop through the array and print to the screen."
		for (int i = 0; i < 5; i++) {
			System.out.println(car1.getInfo()[i]);
		}
		
		System.out.println(printInfo(car1));
		
		//Call the remove vehicle method to clear the variables
		car1.removeVehicle();
		
	}
	
	//Takes automobile input, gives String output of preformatted info using list method
	public static String printInfo(automobile inputCar) {
		String output = inputCar.getInfo()[3] + " " + inputCar.getInfo()[0] + " " + inputCar.getInfo()[1] + ", " + inputCar.getInfo()[2] + ", " + inputCar.getInfo()[4] + " miles";
		System.out.println("Vehicle info formatted");
		return output;
	}
}
