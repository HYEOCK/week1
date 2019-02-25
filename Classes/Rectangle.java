package week1.Classes;

public class Rectangle {
    private String color;
    private int width;
    private int height;

    public Rectangle(String color, int width, int height){
        this.color = color;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width, int height){
        this.color = "Blue";
        this.width = width;
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void paint(){
        String paintColor = this.color.substring(0, 1);
        for (int row = 0; row < this.width; row++){
            for (int col = 0; col < this.height; col++){
                System.out.print(paintColor + " ");
            }
            System.out.println();
        }
    }
}
