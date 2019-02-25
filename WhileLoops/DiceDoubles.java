package week1.WhileLoops;

public class DiceDoubles {
    public static void main(String[] args) {
        boolean dice = true;
        while (dice){
            int s1 = (int)(Math.random() * 6) + 1;
            int s2 = (int)(Math.random() * 6) + 1;
            if (s1 == s2){
                System.out.println(s1 + s2);
                break;
            }else {
                System.out.println("again!");
            }
        }

    }
}
