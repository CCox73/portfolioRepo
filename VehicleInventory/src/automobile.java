
public class automobile {
	
	//Class variables
	private String make;
	private String model;
	private String color;
	private int year;
	private int mileage;
	
	//Default constructor
	public automobile() {
		make = "Unknown";
		model = "Unknown";
		color = "Unknown";
		year = 0000;
		mileage = 0;
	}
	
	//Parameterized constructor
	public automobile(String carMake, String carModel, String carColor, int carYear, int carMileage) {
		make = carMake;
		model = carModel;
		color = carColor;
		year = carYear;
		mileage = carMileage;
	}
	
	//Main
	public static void main(String[] args) {
		automobile[] inventory;
	}

}
