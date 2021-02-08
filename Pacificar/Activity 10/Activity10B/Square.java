public class Square extends Shape{
    private final double length;
    private final double width;

    public Square(double  length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea(){
        return length*width;
    }

    @Override
    public String getName(){
        return "Square";
    }
}
