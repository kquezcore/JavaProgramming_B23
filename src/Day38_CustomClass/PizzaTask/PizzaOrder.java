package Day38_CustomClass.PizzaTask;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class PizzaOrder {
    public static void main(String[] args) {
        ArrayList<Pizza> pizzas = new ArrayList<>();
        //add 30 medium sized pizza with 2 cheese toppings and 2 peperoni toppings

        for (int i = 1; i <= 30; i++) {
            Pizza pizza = new Pizza();
            pizza.customOrder('M', 2, 2);
            pizzas.add(pizza);


        }

        // ADD 80 LARGE PIZZA WITH 3 CHEESE TOPPINGS AND 4 PEPERONI TOPPINGS


        for (int i = 1; i <=80; i++) {
            Pizza pizza = new Pizza();
            pizza.customOrder('L', 3, 4);
            pizzas.add(pizza);
        }


        //add 38 small pizza with 2 cheese toppings and 1 peperoni toppings
        for (int i = 1; i <= 38; i++) {
            Pizza pizza = new Pizza();
            pizza.customOrder('S', 2, 1);
            pizzas.add(pizza);
        }
        System.out.println("Total number of pizza: " + pizzas.size());

        double totalPrice = 0;

        for (Pizza pizza : pizzas) {
            totalPrice += pizza.calcCost();
        }
        System.out.println("TotalPrice= " + totalPrice);
    }
}