package week1.KeyboardInput;

import java.util.Scanner;

public class AgeInFiveYears {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Hello.  What is your name? ");
        String name = in.nextLine();
        System.out.print("Hi, " + name + "How old are you? ");
        int age = in.nextInt();
        System.out.println("Did you know that in five years you will be " + age + " years old? \nAnd five years ago you were " + (age - 5) + "! Imagine that!");
    }
}
