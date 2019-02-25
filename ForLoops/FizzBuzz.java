package week1.ForLoops;

public class FizzBuzz {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 1; i <= 100; i++){
            //num = i;
            //System.out.println(num);
            if (i % 3 == 0){
                System.out.println("Fizz");
            }else if (i % 5 == 0){
                System.out.println("Buzz");
            }else if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }else {
                num = i;
                System.out.println(num);
            }
        }
    }
}
