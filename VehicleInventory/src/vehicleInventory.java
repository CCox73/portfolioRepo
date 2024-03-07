import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class vehicleInventory {

	public static void main(String[] args) {
		
		automobile[] inventory = new automobile[100];
		
		inventory[0] = new automobile("Nissan","Leaf","White",2012,10000);
		inventory[1] = new automobile();
		
		System.out.println(inventory[0].getInfo());
		System.out.println(inventory[1].getInfo());
	}
	
	
}
