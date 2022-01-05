package CoffeeShop;

import java.util.ArrayList;

public class Driver {

    public static CoffeeShop createMenu(){
        ArrayList<MenuItem> menu = new ArrayList<>();
        menu.add(new MenuItem("Coffee", "Drink", 1.99));
        menu.add(new MenuItem("Tea", "Drink", 1.99));
        menu.add(new MenuItem("Juice", "Drink", 2.99));
        menu.add(new MenuItem("Cookie", "Food", 0.99));
        menu.add(new MenuItem("Donut", "Food", 1.99));
        menu.add(new MenuItem("Bagel", "Food", 1.99));
        menu.add(new MenuItem("Muffin", "Food", 1.99));

        return new CoffeeShop("CoffeeShop", menu);
    }

    public static void main(String[] args){
        CoffeeShop shop = createMenu();

        System.out.println("Cheapest Item: " + shop.cheapestItem());

        System.out.println("Drinks: " + shop.drinksOnly().toString());

        System.out.println("Foods: " + shop.foodOnly().toString());

        System.out.println("Current orders: " + shop.listOrders());

        System.out.println(shop.addOrder("Coffee"));
        System.out.println(shop.addOrder("Tea"));
        System.out.println(shop.addOrder("Scone")); //should say item unavailable

        System.out.println("Current Orders: " + shop.listOrders() );
        System.out.println("Total due: $" + shop.dueAmount());

        for (String order: shop.getOrders()) {
            System.out.println(shop.fulfillOrder());
        }
        System.out.println(shop.fulfillOrder());
    }
}
