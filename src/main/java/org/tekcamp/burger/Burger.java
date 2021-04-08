package org.tekcamp.burger;

import java.util.ArrayList;

public class Burger {


    private Bun bun;
    private Meat meat;
    private Topping toppingList;
    private double price;
    private String size;

    public Burger(Bun bun, Meat meat, Topping toppingList, double price, String size) {
        this.bun = bun;
        this.meat = meat;
        this.toppingList = toppingList;
        this.price = price;
        this.size = size;
    }

    public Bun getBun() {
        return bun;
    }

    public Meat getMeat() {
        return meat;
    }

    public Topping getToppingList() {
        return toppingList;
    }

    public double getPrice(double price) {
        return price;
    }

    public String getSize() {
        return size;
    }

    public void eat(Burger burger) {

        System.out.println("I will now eat this " + burger);
    }

    public void addTopping(Topping topping) {
        ArrayList<Topping> toppings = new ArrayList<Topping>();
        toppings.add(topping);

        System.out.println(toppings);
    }

    public void calcPrice(Bun bun, Meat meat, Topping topping) {


      double total = bun.getPrice() + meat.getPrice() + topping.getPrice();

        System.out.println("The total for your burger is " + total);

    }

    /*	Properties :
		Bun
		Meat
		Topping List
		price
		size (small, medium, large, supersize)

	Methods :
		eat()
		addTopping() //limit to max of 5 toppings per main.org.tekcamp.burger.
		calcPrice() //determine the price of the Burger by adding the prices together of all the Composing Classes (Bun, Meat, Toppings).

 */

}
