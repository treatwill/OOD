package org.tekcamp.rcp;

public class Game extends GameItems{

    private Player player;
    private Computer computer;
    private Choices playersChoice;
    private Choices computerChoice;
    private Result result;
    private static int wins;
    private static int loses;
    private static int draws;


    public Game(){
        super();
        player = new Player();
        computer = new Computer();
    }

    public void play(){

        playersChoice = player.getChoices();
        computerChoice = computer.getChoice();

        result = getResult();
        displayResults();
        stats();
    }

    public void displayStats(){
        System.out.println("Your results are " + wins + " wins " + loses + " loses and " + draws + " draws!");
    }

    private void stats(){
        if(result == Result.Win){
            wins++;
        } else if (result == Result.Lose){
            loses++;
        } else {
            draws++;
        }


    }

    private Result getResult(){
        if(playersChoice == computerChoice){
            return result.Draw;
        }
        switch (playersChoice){
            case Rock:
                return (computerChoice == Choices.Scissors ? Result.Win : Result.Lose);
            case Paper:
                return (computerChoice == Choices.Rock ? Result.Win : Result.Lose);
            case Scissors:
                return (computerChoice == Choices.Paper ? Result.Win : Result.Lose);
        }
        return Result.Lose;
    }

    private void displayResults(){
        switch (result){
            case Win:
                System.out.println(playersChoice + "WINS!");
                break;
            case Lose:
                System.out.println(computerChoice + "WINS!");
                break;
            case Draw:
                System.out.println("IT'S A DRAW!");
                break;
        }

    }

}
