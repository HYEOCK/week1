package week1.Classes;

public class Driver {
    public static void main(String[] args) {
        Rectangle s1 = new Rectangle("Blue", 5, 7);
        Rectangle s2 = new Rectangle("Green", 10, 2);
        Rectangle s3 = new Rectangle("Red", 15, 12);
        s1.paint();
        s2.paint();
        s3.paint();
    }
}
