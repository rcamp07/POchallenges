package CoffeeShop;

import java.util.ArrayList;

public class CoffeeShop {

    public static void main(String[] args){

        boolean a = true;
        String name = "CoffeeShop";

        ArrayList<MenuItem> menu= new ArrayList<MenuItem>();
        menu.add(new MenuItem("Coffee", "Drink", 1.99));
        menu.add(new MenuItem("Tea", "Drink", 1.99));
        menu.add(new MenuItem("Juice", "Drink", 1.99));
        menu.add(new MenuItem("Espresso", "Drink", 2.99));
        menu.add(new MenuItem("Muffin", "Food", 2.99));
        menu.add(new MenuItem("Bagel", "Food", 2.99));
        menu.add(new MenuItem("Cookie", "Food", 0.99));
        menu.add(new MenuItem("Scone", "Food", 1.99));
        menu.add(new MenuItem("Donut", "Food", 1.99));
        menu.add(new MenuItem("Croissant", "Food", 1.99));

        ArrayList<MenuItem> order = new ArrayList<MenuItem>();

        System.out.println("Welcome to " + name + ".");
        System.out.println("Main Menu");

        while (a){

        }
    }



}
