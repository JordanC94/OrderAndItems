import java.util.ArrayList;

public class TestOrders {
  public static void main(String[] args) {

    // Menu items
    Item item1 = new Item("mocha", 2.0);
    Item item2 = new Item("latte", 1.0);
    Item item3 = new Item("drip coffee", 3.0);
    Item item4 = new Item("cappuccino", 2.5);
    // Order variables -- order1, order2 etc.
    Order order1 = new Order("Cindi", 0.0, false);
    Order order2 = new Order("Jimmy", 0.0, false);
    Order order3 = new Order("Noah", 0.0, false);
    Order order4 = new Order("Sam", 0.0, false);
    // Application Simulations
    order2.addItems(item1);
    order2.getTotal();
    order3.addItems(item4);
    order3.getTotal();
    order4.addItems(item2);
    order4.getTotal();
    order1.setIsReady(true);
    order1.getIsReady();
    order4.addItems(item2);
    order4.addItems(item2);
    order4.getTotal();
    order2.setIsReady(true);
    order2.getIsReady();
    // Use this example code to test various orders' updates
    System.out.printf("Name: %s\n", order4.getName());
    System.out.printf("Total: %s\n", order4.getTotal());
    System.out.printf("Ready: %s\n", order4.getIsReady());
  }

}
