package org.tekcamp.rcp;

import java.util.Scanner;

public class Player extends GameItems {


    Scanner scan;

   public Player(){
       super();
       scan = new Scanner(System.in);

   }

   public Choices getChoices(){
       System.out.println("Enter your choice R for Rock, P for Paper, or S for Scissors.");
       char playerChoice = scan.nextLine().toUpperCase().charAt(0);

       switch (playerChoice){
           case 'R':
               return Choices.Rock;
           case 'P':
               return Choices.Paper;
           case 'S':
               return Choices.Scissors;
       }
       System.out.println("Invalid input.");
       return getChoices();
   }
}
