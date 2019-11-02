import java.util.ArrayList;
import java.util.Scanner;
public class ShopRunner {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Enter store name");
		String storeName = key.nextLine();
		Shop HEB = new Shop(storeName);
		System.out.println("Shop's name is " + Shop.getName());
		System.out.println("How many aisles are there?");
		int numAisles = key.nextInt();
		key.nextLine();
		for(int i = 0; i < numAisles; i++) {
			System.out.println("Enter the location's name");
			String aisleName = key.nextLine();
			System.out.println("Setting inventory for Location " + aisleName + ":");
			ArrayList<String> items = new ArrayList<String>();
			boolean done = false;
			while(!done) {
				System.out.println("Enter items to add to location or \"done\" when finishing entries");
				String itemEntered = key.nextLine();
				if(itemEntered.equals("done")) {
					done = true;
				} else {
					items.add(itemEntered);
				}
			}
			HEB.addAisle(aisleName, items);
			
		}
		System.out.println("Enter Aisle you want to check out");
		String currentAisle = key.nextLine();
		ArrayList<String> currentItems = HEB.getAisleItems(currentAisle);
		System.out.println(currentItems.size());
		for(int i = 0; i < currentItems.size(); i++) {
			System.out.print("Item" + i + ": " + currentItems.get(i));
			System.out.println();
		}
		

	}

}
