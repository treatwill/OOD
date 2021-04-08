package org.tekcamp.burger;

public class Meal {

//	This class could follow a facade-like design pattern

    private Burger burger;
    private Side side;
    private Drink drink;
    private Double price;

    public Meal(Burger burger, Side side, Drink drink, Double price) {
        this.burger = burger;
        this.side = side;
        this.drink = drink;
        this.price = price;
    }

    public void changeSize(){



    }

    /*
		Properties :
			-Burger
			-Side
			-Drink
			-price (adding the total cost for a Burger, Side, and a Drink)

		Methods :
			-changeSize(size) (up the size of the Bun, Burger, Side, and Drink.)
 	*/
}
