import java.util.Scanner;
import java.util.Random;

/**
 * Created by sam on 9/10/16.
 */
public class OUAT {

    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);
        System.out.println("Lets play a game.");

        System.out.println("What is your name: ");
        String name = reader.nextLine();
        System.out.println("Welcome " + name);

        Scanner input = new Scanner(System.in);
        System.out.println("Are you a Bandit Princess or Evil Queen?");


        String a = input.nextLine();
        if (a.equalsIgnoreCase("Bandit Princess")) {
            System.out.println("Are you ready Bandit Princess " + name + "?");

        } else {
            System.out.println("Are you ready Evil Queen " + name + "?");

        }


        if (a.equalsIgnoreCase("Bandit Princess")) {
            System.out.println("Okay Princess " + name + ", choose your weapon [bow and arrow/Medusa's severed head]");
            String PW = reader.nextLine();

        } else {
            System.out.println("Okay Queen " + name + ", choose your weapon [sword/poison apple]");
            String QW = reader.nextLine();

        }


        System.out.println("Choose your location? [Storybrooke/The Enchanted Forest]");
        String place = reader.nextLine();


        System.out.println("Choose your sidekick? [Maleficent/Ursula]");
        String sk = reader.nextLine();


        System.out.println("Press enter to roll your dice");
        reader.nextLine();


        Scanner console = new Scanner(System.in);
        Random rand = new Random();
        int y = rand.nextInt(5);
        System.out.println(y);

        // Health number = 20
        int score = 20;
        char currentscore;
        String bowArrow;
        String Medusa;
        String sword;
        String poisonApple;

      /*  private static int calculate(); {
            return (int score - y);
        }


        int data = calculate();
        System.out.println("Your enemy has lost " + calculate() + "points!");

    */

     /* public static int calculate() {

          return (int score - int y);
    }

      String PW =
        if (PW.equalsIgnoreCase("sword")) {
            System.out.println(int score - int y);

        } else {
            System.out.println("Are you ready Evil Queen " + name + "?");

        //an if-else conditional statement nested in a for loop is my best guess for the damage section
        //but I don't how to reconcile that with the weapon the player chooses


        // Loser = first to 0

        // Player1 = score
        // Player2 = score

*/


    }



    }

