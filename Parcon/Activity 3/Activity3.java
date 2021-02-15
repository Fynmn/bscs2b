import java.util.Scanner;

public class Activity3 {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);

        System.out.println("\tTemperature Converter\n\t(Celsius to Fahrenheit)\n");

        System.out.print("Enter the Celsius value:");
        double celsius = scan.nextDouble();

        System.out.println("You have entered: " + celsius + "\u2103");

        double result = (celsius * 9/5) + 32;

        System.out.print("The converted temperature is " + result + "\u2109");
    }
}
