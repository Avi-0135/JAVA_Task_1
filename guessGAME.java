import java.util.Random;
import java.util.Scanner;

public class guessGAME {
    public static void main(String[] args) {
        Random random = new Random();
        int random_no=random.nextInt(101);
        System.out.println("Hello There .. its a Guess game You must try to ");

        Scanner sc=new Scanner(System.in);
        System.out.println("Pick a number between 1 to 100.  ");
        int no=sc.nextInt();
        int attempts=0;
        int maxattempts=5;

        while (attempts<maxattempts){

            if (no > random_no) {
                System.out.println("Your pick is too high");
            } else if (no < random_no) {
                System.out.println("Your pick is too low");
            }  else if (no == random_no) {
                System.out.println("You have guessed the correct number in "+ (attempts+1) + " attempts ");
                break;
            }
            attempts++;

            if(attempts>0){
                System.out.println("Guess again ");
                int no1=sc.nextInt();
                no=no1;
            } else if (attempts==maxattempts && no!=random_no) {
                System.out.println("You have failed to guess the number. Your attempts are finished.");
            }
        }

        System.out.println("THE COMPUTER HAS CHOOSEN "+random_no);
    }
}
