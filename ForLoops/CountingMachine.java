package week1.ForLoops;

public class CountingMachine {
    public static void main(String[] args) {
        int num = 0;
        System.out.println("Count to : 19");
        for (int i = 0; i <= 19; i++){
            num = i;
            System.out.print(" " + num + " ");
        }
        System.out.println();
        System.out.println("Count to : 8");
        for (int i = 0; i <= 8; i++){
            num = i;
            System.out.print(" " + num + " ");
        }
        System.out.println();
        System.out.println("Count to : 25");
        for (int i = 0; i <= 25; i++){
            num = i;
            System.out.print(" " + num + " ");
        }
    }
}
