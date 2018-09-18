import java.util.Scanner;

public class numberguess {
    public static void main(String[]args){

        Scanner key;
        key = new Scanner(System.in);
        int pickednumber;
        int imput;

        System.out.println("test your luck and get the randomly generated number. (Note this only goes to 100.)");
        imput = key.nextByte();
        pickednumber = (int)(Math.random()*100);

        System.out.print("And the answer is ");
        System.out.print(pickednumber);

        if (imput == pickednumber){System.out.println("congratulations on wining! You got the 1 and 100 chance of seeing this text!");
        } else if (imput != pickednumber){System.out.println(", sorry, you lost. Please try again.");}

    }
}
