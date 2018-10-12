import java.util.Scanner;

        public class numberguess {
            public static void main(String[] args) {

                Scanner key;

                key = new Scanner(System.in);

                int pickednumber;

                int imput;

                int playAGame;

                int maxtries;

                maxtries = 10;
                for (int tries = 0; tries<maxtries;tries++){
                do {

                    System.out.println("test your luck and get the randomly generated number you only have 10 chances to do it, so be carful. (Note this only goes to 100.)");

                    imput = key.nextByte();

                    pickednumber = (int) (Math.random() * 100);

                    while (imput != pickednumber) {


                        if (imput < pickednumber) {

                            System.out.println("too low please guess again.");

                            imput = key.nextByte();

                        } else if (imput > pickednumber) {

                            System.out.println("Too high guess again.");

                            imput = key.nextByte();
                        }
                    }

                    if (imput == pickednumber) {

                        System.out.println("congratulations on wining! You got the 1 and " + pickednumber + " chance of seeing this text!");

                        System.out.println("Would you like to play again?(1 to continue/2 to stop)");


                    }



                    playAGame = key.nextByte();

                }
                while (playAGame == 1);

                if (playAGame == 2){System.out.println("We hope you had fun please play again.");}



    }
}}
/*  if (answer.equals("n")) {

                    playAGame = false;

                }

                else {playAGame = true;}*/
//maxtries=10
//for(int tries=0;tries>maxtries;tries++;){coad}