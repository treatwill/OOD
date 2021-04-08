package org.tekcamp.burger;

public class Bun {

   private String type;
   private int calories;
   private double price;
   private String size;

    public Bun(String type, int calories, double price, String size) {
        this.type = type;
        this.calories = calories;
        this.price = price;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public int getCalories() {
        return calories;
    }

    public double getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

  /*
		Properties :
			type (sourdough, white bun, whole wheat bun, sliced bread, lettuce, etc.)
			calories
			price
			size (small, medium, large, supersize)
	 */
}
