package CoffeeShop;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class CoffeeShop {

    private String name;

    private ArrayList<MenuItem> menu= new ArrayList<MenuItem>();

    private Queue<String> orders = new ArrayDeque<String>();

    public CoffeeShop() {
    }

    public CoffeeShop(String name, ArrayList<MenuItem> menu) {
        this.name = name;
        this.menu = menu;
    }

    public CoffeeShop(String name, ArrayList<MenuItem> menu, Queue<String> orders) {
        this.name = name;
        this.menu = menu;
        this.orders = orders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<MenuItem> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<MenuItem> menu) {
        this.menu = menu;
    }

    public Queue<String> getOrders() {
        return orders;
    }

    public void setOrders(Queue<String> orders) {
        this.orders = orders;
    }

    public String addOrder(String itemName){
        int a = this.getOrders().size();
        for(MenuItem n : menu){
            if (n.getName().equals(itemName)){
                this.getOrders().add(itemName);
            }
        }
        if (this.getOrders().size() == a) {
            return "This item is currently unavailable";
        } else {
            return itemName + " successfully ordered";
        }
    }

    public String fulfillOrder(){
        if (this.getOrders().size()==0){
            return "All orders have been fulfilled!";
        } else {
            String ordDone = this.getOrders().poll();
            return "Order: " + ordDone + " completed";
        }
    }

    public Queue<String> listOrders(){
        return this.getOrders();
    }

    public double dueAmount(){
        double amount = 0;
        if (this.getOrders().size() != 0){
            for (String s : this.getOrders()){
                for (MenuItem m : this.getMenu()){
                    if (m.getName().equals(s)){
                        amount += m.getPrice();
                    }
                }
            }
        }
        return  amount;
    }

    public String cheapestItem(){
        double minPrice = 0;
        String item = "";
        for (MenuItem m : this.getMenu()){
            if (minPrice == 0 || m.getPrice() < minPrice){
                minPrice = m.getPrice();
                item = m.getName();
            }
        }
        return item;
    }

    public ArrayList<String> drinksOnly(){
        ArrayList<String> drinks = new ArrayList<String>();
        for (MenuItem m : this.getMenu()){
            if (m.getType().equals("Drink")){
                drinks.add(m.getName());
            }
        }
        return drinks;
    }

    public ArrayList<String> foodOnly(){
        ArrayList<String> foods = new ArrayList<String>();
        for (MenuItem m : this.getMenu()){
            if (m.getType().equals("Food")){
                foods.add(m.getName());
            }
        }
        return foods;
    }
}
