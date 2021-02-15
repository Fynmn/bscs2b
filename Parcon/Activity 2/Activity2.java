import java.util.Scanner;

class Activity2 {
  public static void main(String[] args) {
    Scanner mynum = new Scanner(System.in);

    System.out.println("Enter Number 1: ");
    // String input
      int num1 = mynum.nextInt();
    System.out.println("Enter Number 2: ");
      int num2 = mynum.nextInt();
     
    // Output input by user
    System.out.println("Sum = " + (num1 + num2)); 
    System.out.println("Difference = " + (num1 - num2)); 
    System.out.println("Product = " + (num1 * num2)); 
    System.out.println("Qoutient = " + (num1 / num2));
    System.out.println("Remainder = " + (num1 % num2));
  }
}
