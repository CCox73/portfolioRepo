
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
			System.out.println("automobile() success");
		}
		catch (Exception excpt) {
			System.out.println(excpt.getMessage());
			System.out.println("automobile() failed");
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
			System.out.println("automobile(String,String,String,int,int) success");
		}
		catch (Exception excpt) {
			System.out.println(excpt.getMessage());
			System.out.println("automobile(String,String,String,int,int) failed");
		}
	}
	
	//List Vehicle Info
	public String[] getInfo() {
		try {
			String[] list = {make, model, color, year + "", mileage + ""};
			System.out.println("getInfo() success");
			return list;
		}
		catch (Exception excpt) {
			System.out.println(excpt.getMessage());
			System.out.println("getInfo() failed");
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
			System.out.println("removeVehicle() success");
		}
		catch (Exception excpt) {
			System.out.println(excpt.getMessage());
			System.out.println("removeVehicle() failed");
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
			System.out.println("updateInfo(String,String,String,int,int) success");
		}
		catch (Exception excpt) {
			System.out.println(excpt.getMessage());
			System.out.println("updateInfo(String,String,String,int,int) failed");
		}
	}
	//Update vehicle attributes (one at a time, for String info)
	public void updateInfo(int choice, String newInfo) {
		try {
			switch (choice) {
			case 0:
				make = newInfo;
				System.out.println("updateInfo(0,String) success");
				break;
			case 1:
				model = newInfo;
				System.out.println("updateInfo(1,String) success");
				break;
			case 2:
				color = newInfo;
				System.out.println("updateInfo(2,String) success");
				break;
			default:
				System.out.println("updateInfo(int,String) failed");
			}
		}
		catch (Exception excpt) {
			System.out.println(excpt.getMessage());
			System.out.println("updateInfo(int,String) failed");
		}
	}
	//Update vehicle attributes (one at a time, for int info)
	public void updateInfo(int choice, int newInfo) {
		try {
			switch (choice) {
			case 3:
				year = newInfo;
				System.out.println("updateInfo(3,int) success");
				break;
			case 4:
				mileage = newInfo;
				System.out.println("updateInfo(4,int) success");
				break;
			default:
				System.out.println("updateInfo(int,int) failed");
			}
		}
		catch (Exception excpt) {
			System.out.println(excpt.getMessage());
			System.out.println("updateInfo(int,int) failed");
		}
	}
}
