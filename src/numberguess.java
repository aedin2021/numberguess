import java.util.Scanner;

public class numberguess {
    public static void main(String[]args){

        Scanner key;
        key = new Scanner(System.in);
        int pickednumber;
        int imput;
        boolean playAGame = true;
        String y;
        String n;
        String answer;

        do {System.out.println("test your luck and get the randomly generated number. (Note this only goes to 100.)");
        imput = key.nextByte();
        pickednumber = (int)(Math.random()*100);
        do {
            if (imput < pickednumber) {
                System.out.println("too low please guess again.");
                imput = key.nextByte();
            } else if (imput > pickednumber) {
                System.out.println("Too high guess again.");
                imput = key.nextByte();
            }
        }while (imput != pickednumber);
        if (imput == pickednumber) {
            System.out.println("congratulations on wining! You got the 1 and "+ pickednumber+" chance of seeing this text!");}}while (playAGame);
        System.out.println("Would you like to play again?");
        answer = key.nextLine();
        playAGame = answer.equalsIgnoreCase("y");




    }
}
