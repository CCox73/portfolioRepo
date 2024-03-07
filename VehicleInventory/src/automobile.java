
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
	}
	
	//Parameterized constructor
	public automobile(String carMake, String carModel, String carColor, int carYear, int carMileage) {
		make = carMake;
		model = carModel;
		color = carColor;
		year = carYear;
		mileage = carMileage;
	}
	
	//List Vehicle Info !!!!!!!!!!TO DO !!!!!!!!!!!! make this return a string array
	public String[] getInfo() {
		String[] list = {make, model, color, year + "", mileage + ""};
		return list;
	}
}
