
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
		System.out.println("Vehicle info retrieved");
		return list;
	}
	
	//Remove vehicle
	public void removeVehicle() {
		
	}
	
	public void updateInfo() {
		
	}
}
