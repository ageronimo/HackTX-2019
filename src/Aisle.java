import java.util.ArrayList;
public class Aisle {
	private static String aisleName;
	private static ArrayList<String> items = new ArrayList<String>();
	
	// creates new Aisle object with no name and no items stored
	public Aisle() {
		this("", new ArrayList<String>());
	}
	
	// creates new Aisle object with name entered and array of items entered
	public Aisle(String name, ArrayList<String> itemsEntered) {
		aisleName = name;
		items = itemsEntered;
	}
	
	// returns name of the aisle
	public static String getAisleName() {
		return aisleName;
	}
	
	// changes aisle name
	public static void changeAisleName(String name) {
		aisleName = name;
	}
	
	// returns String array of items in the aisle
	public static ArrayList<String> getItems() {
		return items;
	}
	
	// changes list of items
	public static void changeItems(ArrayList<String> itemsEntered) {
		items = itemsEntered;
	}
	
	// add item to items in Aisle
	public static void addItem(String item) {
		items.add(item);
	}
	
	// remove item to items in Aisle
	public static void removeItem(String item) {
		items.remove(item);
	}
	
	// check if item is in the Aisle
	public static boolean contains(String itemDesired) {
		return items.contains(itemDesired);
	}
}
