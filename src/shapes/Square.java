package shapes;

public class Square extends Rectangle{

    protected int side;

    public Square(int side){
        super(side, side);
    }

    @Override
    public int getArea(){
        System.out.println("Using Square class!");
        return this.length*this.length;
    }

    @Override
    public int getPerimeter(){
        System.out.println("Using Square class!");
        return 4*this.length;
    }

//    public int getArea(int side){
//        return side*side;
//    }
//
//    public int getPerimeter(int side){
//        return 4*side;
//    }
}
