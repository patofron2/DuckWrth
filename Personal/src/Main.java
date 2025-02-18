public class Main {
    public static void main(String[] args) {
        Item[] items = {
                new Item("bottle", "water", "empty"),
                new Item("power bank", "lithium ion", "110Wh"),
                new Item("face wash", "liquid", "100ml")
        };

        // Create an initialisation of the Bag class
        Bag bag = new Bag();

        // Add an item to the bag
        for (Item item : items) {
            // Check if the item can be packed and add it to the bag
            bag.addItems(item);
        }

        // Display the packed items
        System.out.println("Packed items:");
        for (Item item : bag.getPackedItems()) {
            System.out.println(item); // Print each packed item
        }
    }
}


