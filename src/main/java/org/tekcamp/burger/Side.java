package org.tekcamp.burger;

public class Side {

    private String type;
    private String size;
    private double price;

    public Side(String type, String size, double price) {
        this.type = type;
        this.size = size;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    /*
		Properties :
			-type - (fries, chips, apple pie, ice cream, etc.)
			-size (small, medium, large, supersize).
			-price
	 */


}
