package week1.WhileLoops;

import java.util.Scanner;

public class AddingValuesInLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("I will add up the numbers you give me.");
        int num = 0;
        num = in.nextInt();
        int plus = 0;
        plus = num + plus;
        while (num != 0){
            System.out.println(plus);
            num = in.nextInt();
            plus = num + plus;
        }
        System.out.println("The total is " + plus);

    }
}
