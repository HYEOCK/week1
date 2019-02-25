package week1.KeyboardInput;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class MoreUserInputOfData {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("first name : ");
        String fName = in.nextLine();

        System.out.print("last name : ");
        String lName = in.nextLine();

        System.out.print("Grade (9-12) : ");
        int grade = in.nextInt(); // "12\n"

        System.out.print("Student ID : ");
        double id = in.nextDouble(); // "5.5"\n <- double
        in.nextLine();

        System.out.print("Login : ");
        String loginName = in.nextLine();

        System.out.print("GPA (0.0-4.0) : ");
        double gpa = in.nextDouble();

        String f = String.format("Your information : " + "\nLogin : " +loginName + "\nID : " + id + "\nName : " + fName + "," + lName + "\nGPA : " + gpa + "\nGrade : " + grade);
        System.out.println(f);



    }
}
