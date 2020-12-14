package shapes;

public class Rectangle {

    protected int length;
    protected int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getArea(){
        System.out.println("Using Rectangle class!");
        return length*width;
    }

    public int getPerimeter(){
        System.out.println("Using Rectangle class!");
        return length*2 + width*2;
    }










}
