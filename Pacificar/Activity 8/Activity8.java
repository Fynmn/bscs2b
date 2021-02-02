public class Activity8 {
    public static void main(String[] args) {
        //NATALIE JANE PACIFICAR
        //BSCS 2B-AI
        
        //QUESTION 1
        //Class: Integer
        //Method Declaration: public boolean endsWith(String suffix)
        //Sample Usage:
        String word = "Hello";
        System.out.println("Does 'Hello' end with" + " 'lo' : " + word.endsWith("lo"));
        System.out.println("Does 'Hello' end with" + " 'no' : " + word.endsWith("no"));

        //QUESTION 2
        //Class: Character
        //Method Declaration: public static char forDigit(int digit, int radix)
        //Sample Usage:
        int dig = 15;
        int rad = 16;
        System.out.println("The character in digit 15 and radix 16 is " + Character.forDigit(dig, rad));

        //QUESTION 4
        //Class: Math
        //Method Declaration: public static double floor(double a)
        //Sample Usage:
        double value = 3.13;
        System.out.println("The floor value of 3.13 is " + Math.floor(value));

        //QUESTION 5
        //Class: Math
        //Method Declaration: public static double floor(double a)
        //Sample Usage:
        char character = '3';
        System.out.println("Character " + character + " is a digit? " + Character.isDigit(character));

        //QUESTION 3
        //Class: Runtime
        //Method Declaration: public static Runtime getRuntime() AND public void exit(int status)
        //Sample Usage:
        Runtime.getRuntime().exit(0);
        
    }
}
