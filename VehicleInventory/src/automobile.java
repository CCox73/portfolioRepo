
public class automobile {
	
	//Class variables
	private String make;
	private String model;
	private String color;
	private int year;
	private int mileage;
	
	//Default constructor
	public automobile() {
		try {
			make = "DefaultMake";
			model = "DefaultModel";
			color = "DefaultColor";
			year = 9999;
			mileage = 0;
			System.out.println("Default vehicle created");
		}
		catch (Exception excpt) {
			System.out.println(excpt.getMessage());
			System.out.println("Default construction failed");
		}
	}
	
	//Parameterized constructor
	public automobile(String carMake, String carModel, String carColor, int carYear, int carMileage) {
		try {
			make = carMake;
			model = carModel;
			color = carColor;
			year = carYear;
			mileage = carMileage;
			System.out.println("Parameterized vehicle created");
		}
		catch (Exception excpt) {
			System.out.println(excpt.getMessage());
			System.out.println("Parameterized construction failed");
		}
	}
	
	//List Vehicle Info
	public String[] getInfo() {
		try {
			String[] list = {make, model, color, year + "", mileage + ""};
			System.out.println("Variable retrieved");
			return list;
		}
		catch (Exception excpt) {
			System.out.println(excpt.getMessage());
			System.out.println("Vehicle info retrieval failed");
			return null;
		}
	}
	
	//Remove vehicle (Objects are deleted automatically through garbage collection,
	//this just sets all of its values to 0 or null)
	public void removeVehicle() {
		try {
			make = null;
			model = null;
			color = null;
			year = 0;
			mileage = 0;
			System.out.println("Vehicle removed");
		}
		catch (Exception excpt) {
			System.out.println(excpt.getMessage());
			System.out.println("Vehicle removal failed");
		}
	}
	
	//Update vehicle attributes (all at once)
	public void updateInfo(String newMake, String newModel, String newColor, int newYear, int newMileage) {
		try {
			make = newMake;
			model = newModel;
			color = newColor;
			year = newYear;
			mileage = newMileage;
			System.out.println("All vehicle info updated");
		}
		catch (Exception excpt) {
			System.out.println(excpt.getMessage());
			System.out.println("Vehicle info update failed");
		}
	}
	//Update vehicle attributes (one at a time, for String info)
	public void updateInfo(int choice, String newInfo) {
		try {
			switch (choice) {
			case 0:
				make = newInfo;
				System.out.println("Vehicle make updated");
				break;
			case 1:
				model = newInfo;
				System.out.println("Vehicle model updated");
				break;
			case 2:
				color = newInfo;
				System.out.println("Vehicle color updated");
				break;
			default:
				System.out.println("Error: 0-2 require String input, 3-4 require int input");
			}
		}
		catch (Exception excpt) {
			System.out.println(excpt.getMessage());
			System.out.println("Vehicle info update failed");
		}
	}
	//Update vehicle attributes (one at a time, for int info)
	public void updateInfo(int choice, int newInfo) {
		try {
			switch (choice) {
			case 3:
				year = newInfo;
				System.out.println("Vehicle year updated");
				break;
			case 4:
				mileage = newInfo;
				System.out.println("Vehicle mileage updated");
				break;
			default:
				System.out.println("Error: 0-2 require String input, 3-4 require int input");
			}
		}
		catch (Exception excpt) {
			System.out.println(excpt.getMessage());
			System.out.println("Vehicle info update failed");
		}
	}
}
