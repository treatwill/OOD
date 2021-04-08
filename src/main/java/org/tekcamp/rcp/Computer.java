package org.tekcamp.rcp;

import java.util.Random;

public class Computer extends GameItems{

    private Random rand;


    public Computer() {
        super();
        rand = new Random();
    }

    public Choices getChoice(){
        int choice = 1 + rand.nextInt(3);
        switch (choice){
            case 1:
                return Choices.Rock;

            case 2:
                return Choices.Paper;

        }
        return Choices.Scissors;
    }
}
