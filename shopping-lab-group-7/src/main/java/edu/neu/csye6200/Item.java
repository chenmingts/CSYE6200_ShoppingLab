package edu.neu.csye6200;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Item {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    // Class variables
    private final String name;
    private final double price;

    // Constructor
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public static final String REVISION = "Thanks for shopping with Group-7";

    public static void demo() {

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println("--------------------------------------------------------");
        System.out.println("Receipt");
        System.out.println("--------------------------------------------------------\n");
        System.out.println("Date & Time: " + dateFormat.format(date));
        System.out.println("Revision: " + REVISION);
        System.out.println("--------------------------------------------------------");
        System.out.println("Item\t\t\t\tPrice");
        System.out.println("--------------------------------------------------------");
        // Create shopping items
        List<Item> items = new ArrayList<>();
        Item item1 = new Item("Hoodie", 12.99);
        Item item2 = new Item("Ring", 3.49);
        Item item3 = new Item("Bag", 2.80);
        items.add(item1);
        items.add(item2);
        items.add(item3);
        getItemDetails(items).forEach(System.out::println);

        // Calculate total cost
        double totalCost = item1.getPrice() + item2.getPrice() + item3.getPrice();

        // Calculate change
        double cash = 20.00;
        double change = cash - totalCost;
        System.out.println("--------------------------------------------------------");
        System.out.println("Total:\t\t$" + df.format(totalCost));
        System.out.println("Cash:\t\t$" + df.format(cash));
        System.out.println("Change:\t\t$" + df.format(change));
        System.out.println("--------------------------------------------------------");
    }

    public static List<String> getItemDetails(List<Item> items) {
        List<String> itemDetailList = new ArrayList<>();
        String itemDetails;
        for(int i=0;i<items.size();i++) {
            itemDetails = i+1 + ".    Item Name: " + items.get(i).getName() + "    Item Price: "
                    + items.get(i).getPrice();
            itemDetailList.add(itemDetails);
        }
        return itemDetailList;
    }

    @Override
    public String toString() {
        return null;
    }
}
