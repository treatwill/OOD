package org.tekcamp.burger;

import java.util.Scanner;

public class BurgerShop {


   private String shopName;
   private String location;
   private String phoneNumber;


    public BurgerShop(String shopName, String location, String phoneNumber) {
        this.shopName = shopName;
        this.location = location;
        this.phoneNumber = phoneNumber;
    }

    public void takeOrder() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter burger, drink, and side order");
        String burger = scan.nextLine();
        String drink = scan.nextLine();
        String side = scan.nextLine();

        System.out.println("You ordered the " + burger);
        System.out.println("with the " + side);
        System.out.println("and a " + drink + " to drink.");
    }

    public void prepareMeal(Meal meal) {
        System.out.println("Your " + meal + " is being prepared");
    }

    /*
	Properties :
		shopName
		location (address)
		phoneNumber

	Methods :
		takeOrder() take the details of the order
		prepareMeal() => Meal
 	*/


}
