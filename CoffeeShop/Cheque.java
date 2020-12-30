package AyanotCoffeeShopLuxuryVillage;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cheque extends CoffeeSandwichMaker {

    private String name;
    private LocalDateTime dateTime;
    private boolean flag = false;
    private int totalPrice = 0;
    private StringBuilder finishOrder = new StringBuilder();
    public static Map<String, ArrayList<String>> allCheque = new HashMap<>();
    private enum Coffees {Amerikano, Asiano, Russiano}
    private enum Sandwiches {Club, Toster, DayAndNight}

    public Cheque(String name) {
        this.name = name;
        dateTime = LocalDateTime.now();
        greeting();
        while (!flag) {choose();}
        if (flag) {
            setCheque();
            printCheque();
        }
    }

    private void greeting() {
        int number = 1;
        System.out.println("Hello! We have 3 types of coffee and 3 of sandwiches.\nIf you finished - pressed 0.\n");
        for (Coffees coffees: Coffees.values()) {
            System.out.println(number + " - " + coffees.name());
            number++;
        }
        for (Sandwiches sandwiches: Sandwiches.values()) {
            System.out.println(number + " - " + sandwiches.name());
            number++;
        }
    }
    private void choose() {
        try  {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Please, make your choice:");
            String s = reader.readLine();
            switch (s) {
                case "1","2","3" -> addCoffee(Integer.parseInt(s));
                case "4","5","6" -> addSandwich(Integer.parseInt(s));
                case "0" -> flag  = true;
                default -> throw new Exception();
            }
        }catch (Exception e) {
            System.out.println("Incorrect. Try again");
        }
    }
    private void addCoffee(int type) {
        totalPrice += CoffeeSandwichMaker.makeCoffee(type).getPrice();
        finishOrder.append(CoffeeSandwichMaker.makeCoffee(type).getType()).append("|");
    }
    private void addSandwich(int type) {
        totalPrice += CoffeeSandwichMaker.makeSandwich(type).getPrice();
        finishOrder.append(CoffeeSandwichMaker.makeSandwich(type).getType()).append("|");
    }
    private void setCheque() {
        ArrayList<String> order = new ArrayList<>();
        order.add("Customer: " + name);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        order.add("Time: " + dateTime.format(formatter));
        order.add("Order: " + finishOrder.toString());
        order.add("Total price: " + totalPrice);
        allCheque.put(name,order);
    }
    private void printCheque() {
        System.out.println("Thank you for order, " + this.name);
        allCheque.get(name).forEach(System.out::println);
    }

    public String getName() {
        return name;
    }
}
