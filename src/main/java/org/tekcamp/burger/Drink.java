package org.tekcamp.burger;

public class Drink {

    private String liquid;
    private String size;
    private double price;

    public Drink(String liquid, String size, double price) {
        this.liquid = liquid;
        this.size = size;
        this.price = price;
    }

    public String getLiquid() {
        return liquid;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }


    /*
		Properties :
			liquid (water, gatorade, power aid, coke, mountain dew, sprite, fanta, dr. pepper, diet coke, etc.)
			size (small, medium, large, supersize)
			price
	 */
}
