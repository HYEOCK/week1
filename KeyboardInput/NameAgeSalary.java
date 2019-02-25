package week1.KeyboardInput;

import java.util.Scanner;

public class NameAgeSalary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello.  What is your name?");
        String line1 = in.nextLine();
        String name = "Dennis";
        System.out.println("Hi, " + name + "!" + "How old are you?");
        String line2 = in.nextLine();
        int age = 37;
        System.out.println("So you're " + age + ", eh? That's not old at all!" + "\nHow much do you make, " + name + "?");
        String line3 = in.nextLine();
        double money = 8.50;
        System.out.println(money + "! I hope that's per hour and not per year! LOL!");
        }

    }

