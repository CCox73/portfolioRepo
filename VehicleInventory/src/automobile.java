
public class automobile {
	
	//Class variables
	private String make;
	private String model;
	private String color;
	private int year;
	private int mileage;
	
	//Default constructor
	public automobile() {
		make = "UnknownMake";
		model = "UnknownModel";
		color = "UnknownColor";
		year = 1886;
		mileage = 0;
		System.out.println("Default vehicle created");
	}
	
	//Parameterized constructor
	public automobile(String carMake, String carModel, String carColor, int carYear, int carMileage) {
		make = carMake;
		model = carModel;
		color = carColor;
		year = carYear;
		mileage = carMileage;
		System.out.println("Parameterized vehicle created");
	}
	
	//List Vehicle Info
	public String[] getInfo() {
		String[] list = {make, model, color, year + "", mileage + ""};
		System.out.println("Variable retrieved");
		return list;
	}
	
	//Remove vehicle
	//
	public void removeVehicle() {
		make = null;
		model = null;
		color = null;
		year = 0;
		mileage = 0;
		System.out.println("Vehicle removed");
	}
	
	//Update info (all at once)
	public void updateInfo(String newMake, String newModel, String newColor, int newYear, int newMileage) {
		make = newMake;
		model = newModel;
		color = newColor;
		year = newYear;
		mileage = newMileage;
		System.out.println("All vehicle info updated");
	}
	//Update info (one at a time, for String info)
	public void updateInfo(int choice, String newInfo) {
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
	//Update info (one at a time, for int info)
	public void updateInfo(int choice, int newInfo) {
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
}
