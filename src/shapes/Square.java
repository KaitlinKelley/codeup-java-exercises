package shapes;

public class Square extends Rectangle{

    protected int side;

    public Square(int side){
        super(side, side);
    }

    @Override
    public int getArea(){
        System.out.println("Using Square class!");
        int side = this.length;
        return side*side;
    }

    @Override
    public int getPerimeter(){
        System.out.println("Using Square class!");
        int side = this.length;
        return 4*side;
    }


}
