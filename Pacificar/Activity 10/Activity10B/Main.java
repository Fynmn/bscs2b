import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter radius for circle: ");
        double radius = scan.nextDouble();
        System.out.print("Enter length for square: ");
        double length = scan.nextDouble();
        System.out.print("Enter width for square: ");
        double width = scan.nextDouble();


        Shape circle = new Circle(radius);
        Shape square = new Square(length, width);

        System.out.println("Shape 1: " + circle.getName() + " = " + circle.getArea());
        System.out.println("Shape 2: " + square.getName() + " = " + square.getArea());
    }
}
