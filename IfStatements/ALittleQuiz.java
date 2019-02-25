package week1.IfStatements;

import java.util.Scanner;

public class ALittleQuiz {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Are you ready for a quiz? (Y, N)");
        System.out.println("Okay, here it comes!");

        int right = 0;
        System.out.println("Q1) What is the capital of Alaska?\n" + "1) Melbourne\n" + "2) Anchorage\n" + "3) Juneau");
        int quiz1 = myScanner.nextInt();
        if (quiz1 == 3){
            System.out.println("That's right!");
            right++;
        }
        System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?\n" + "1) yes\n" + "2) no");
        int quiz2 = myScanner.nextInt();
        if (quiz2 == 2){
            System.out.println("That's right!");
            right++;
        }else {
            System.out.println("Sorry, \"cat\" is a string. ints can only store numbers.");
        }
        System.out.println("Q3) What is the result of 9+6/3?\n" + "1) 5\n" + "2) 11\n" + "3) 15/");
        int quiz3 = myScanner.nextInt();
        if (quiz3 == 2){
            System.out.println("That's right!");
            right++;
        }
        System.out.println("Overall, you got " + right + " out of 3 correct. \nThanks for playing!");

    }
}
