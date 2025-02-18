import java.util.ArrayList;
import java.util.List;

public class Bag {
    // List where we can store the items that can be packed
    private List<Item> items;

    // Constructor to initialize the list
    public Bag() {
        items = new ArrayList<>();
    }

    // Method that checks if an item can be added to a bag and then adds it
    public void addItems(Item item) {
        if (canPack(item)) { // Changed 'Item' to 'item'
            items.add(item);
            System.out.println(item.getName() + " can be packed.");
        } else {
            System.out.println(item.getName() + " cannot be packed.");
        }
    } // Added missing closing curly brace for the method

    // Private method to check if an item can be packed based on rules
    private boolean canPack(Item item) {
        // Define the rules
        if (item.getName().equalsIgnoreCase("bottle") && item.getStatus().equalsIgnoreCase("110Wh")) {
            return false;
        }
        if (item.getName().equalsIgnoreCase("face wash") && item.getStatus().equalsIgnoreCase("100ml")) {
            return false;
        }
        return true;
    }

    // Method to get list of items that were packed
    public List<Item> getPackedItems() {
        return items;
    }
}