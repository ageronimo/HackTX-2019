import java.util.ArrayList;

public class Shop {
	private static ArrayList<Aisle> inventory;
	private static String shopName;

	// constructor for new Shop object
	public Shop() {
		this("", new ArrayList<Aisle>());
	}

	// constructor for a new Shop object
	public Shop(String name) {
		this(name, new ArrayList<Aisle>());
	}

	// creates a new store object that stores the Shop name and inventory
	// can be retrieved by the main app
	public Shop(String nameEntered, ArrayList<Aisle> inventoryEntered) {
		shopName = nameEntered;
		inventory = inventoryEntered;
	}

	// changes the store name stored in the Shop object
	public static void setName(String name) {
		shopName = name;
	}

	// returns name of the shop
	public static String getName() {
		return shopName;
	}

	// returns aisle total
	public static int getAisleTotal() {
		return inventory.size();
	}

	// adds new aisle to inventory
	public static void addAisle(String aisleName, ArrayList<String> items) {
		inventory.add(new Aisle(aisleName, items));
	}

	// changes items in an Aisle
	public static void changeAisleItems(String aisleName, ArrayList<String> items) {
		for (int i = 0; i < inventory.size(); i++) {
			if (inventory.get(i).getAisleName().equals(aisleName)) {
				inventory.get(i).changeItems(items);
			}
		}
	}

	// adds a singular item to an Aisle
	public static void addItem(String aisleName, String item) {
		for (int i = 0; i < inventory.size(); i++) {
			if (inventory.get(i).getAisleName().equals(aisleName)) {
				inventory.get(i).addItem(item);
			}
		}
	}
	
	// removes a singular item from an Aisle
	public static void removeItem(String aisleName, String item) {
		for (int i = 0; i < inventory.size(); i++) {
			if (inventory.get(i).getAisleName().equals(aisleName)) {
				inventory.get(i).removeItem(item);
			}
		}
	}

	// returns contents of an aisle
	public static ArrayList<String> getAisleItems(String aisleName) {
		for (int i = 0; i < inventory.size(); i++) {
			if (inventory.get(i).getAisleName().equals(aisleName)) {
				return inventory.get(i).getItems();
			}
		}
		return new ArrayList<String>();
	}

	// returns the aisle name the desired item is located in
	public static String findItemLocation(String itemDesired) {
		for (int i = 0; i < inventory.size(); i++) {
			if (inventory.get(i).contains(itemDesired)) {
				return inventory.get(i).getAisleName();
			}
		}
		return "NOT IN STORE";
	}

}
