import java.io.*;
import java.util.Scanner;
public class vehicleInventory {
	
	public static int inventorySize = 0;
	public static automobile[] inventory = new automobile[100];

	public static void main(String[] args) {
		
		automobile car1 = new automobile("Nissan", "Leaf", "White", 2012, 10000);
		
		System.out.println(car1.getInfo()[0]);
		for (int i = 0; i < 5; i++) {
			System.out.println(car1.getInfo()[i]);
		}
	}
	
}
