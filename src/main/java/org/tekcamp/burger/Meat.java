package org.tekcamp.burger;

public class Meat {

   private String type;
   private double price;
   private String size;

   public Meat(String type, double price, String size) {
      this.type = type;
      this.price = price;
      this.size = size;
   }

   public String getType() {
      return type;
   }

   public double getPrice() {
      return price;
   }

   public String getSize() {
      return size;
   }

   /*
		Properties :
			-type (chicken, steak, beef, turkey, tuna, etc.)
			-price
			-size - (small, medium, large, supersize)
	 */


}
