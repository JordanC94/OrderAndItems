import java.util.ArrayList;

// class and what datatype the constructors will be.
public class Order {
  private String name;
  private double total;
  private boolean isReady;
  private ArrayList<Item> items;

  // constructors
  public Order(String name, double total, boolean isReady) {
    this.name = name;
    this.total = total;
    this.isReady = isReady;
    // member variable and setting the new to an array list in my item class.
    this.items = new ArrayList<Item>();
  }

  // Getter for the name
  public String getName() {
    return this.name;
  }

  // Setter for the name
  public void setName(String name) {
    this.name = name;
  }

  // Getter to get total price of items
  public double getTotal() {
    return this.total;
  }

  // Setter to see the total of the order
  public void setTotal(double total) {
    this.total = total;
  }

  // Getter for the status of the order
  public boolean getIsReady() {

    return this.isReady;
  }

  // Setter to see the satus of the order
  public void setIsReady(boolean isReady) {
    this.isReady = isReady;
  }

  // getter for list of items
  public ArrayList<Item> getItems() {
    return this.items;
  }

  // Setter for list of items
  public void setItems(ArrayList<Item> items) {
    this.items = items;
  }

  // method that adds items to my order class list of items.
  public ArrayList<Item> addItems(Item item) {
    items.add(item);
    this.total += item.getPrice();
    return items;
  }
}