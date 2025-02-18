public class Item {
    // Make private fields so they can only be accessed
    // in the Item class
    private String name;
    private String type;
    private String status;

    // Constructor that assigns a name, type of thing it carries, and status
    public Item(String name, String type, String status) {
        this.name = name;
        this.type = type;
        this.status = status;
    }

    // Getter that returns the name of an item
    public String getName() {
        return name;
    }

    // Getter for type of thing
    public String getType() { // Changed return type from void to String
        return type;
    }

    // Getter for status
    public String getStatus() {
        return status;
    }

    // Override method to provide string representation of an item
    @Override
    public String toString() {
        return name + " " + type + " " + status;
    }
}