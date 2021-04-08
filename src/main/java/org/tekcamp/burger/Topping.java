package org.tekcamp.burger;

public class Topping {

    private String name;
    private double price;
    private int quantity;

    public Topping(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

   /*
		Properties :
			name (example toppings : onions, cheese, green peppers, pickles, ketchup, mustard, relish, mushrooms, guacamole etc.)
			price (some toppings have an added cost, others don't.  i.e. guacamole, mushrooms, extra cheese, have added upcharges.  ketchup does not, etc.
			quantity
	 	*/
}


