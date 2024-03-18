
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
			System.out.println("Default automobile created");
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
			System.out.println("Parameterized automobile created");
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
			//System.out.println("getInfo() success");
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
	public boolean checkInfo(String makeInput, String modelInput, String colorInput, int yearInput, int mileageInput) {
		try {
			if(make.equals(makeInput) && model.equals(modelInput) && color.equals(colorInput) && year == yearInput && mileage == mileageInput){
				System.out.println("Search successful: match found");
				return true;
			}else {
				//System.out.println("Search successful: no matches found");
				return false;
			}
		}
		catch (Exception excpt) {
			System.out.println(excpt.getMessage());
			System.out.println("Search failed");
			return false;
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
			//System.out.println("updateInfo(String,String,String,int,int) success");
		}
		catch (Exception excpt) {
			System.out.println(excpt.getMessage());
			System.out.println("updateInfo(String,String,String,int,int) failed");
		}
	}
}
