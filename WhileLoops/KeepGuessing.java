package week1.WhileLoops;

import java.util.Scanner;

public class KeepGuessing {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");

        while (true){
            int num = myScanner.nextInt();
            if (num == 5){
                System.out.println("That is incorrect. Guess again.");
            }else if (num == 4){
                System.out.println("That is incorrect. Guess again.");
            }else if (num == 8){
                System.out.println("That is incorrect. Guess again.");
            }else if (num == 6){
                System.out.println("That's right! You're a good guesser.");
            }else {
                break;
            }
        }
    }
}
