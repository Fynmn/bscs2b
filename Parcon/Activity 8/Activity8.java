public class Activity8{

public static void main(String[] args){
/*
  9.6 Exercises 
9.6.1 Defining terms 
In your own words, define the following terms: 
1. Class - a class is an extensible program-code-template for creating objects, providing initial values for state (member variables) and implementations of behavior (member functions or methods)
2. Object - An object is an abstract data type with the addition of polymorphism and inheritance.
3. Instantiate - Instantiate in Java means to call a constructor of a Class which creates an an instance or object, of the type of that Class. Instantiation allocates the initial memory for the object and returns a reference.
4. Instance Variable - An instance variable is a variable which is declared in a class but outside of constructors, methods, or blocks. Instance variables are created when an object is instantiated, and are accessible to all the constructors, methods, or blocks in the class.
5. Instance Method - An instance method in Java is basically a method of the class. In other words, a non-static method which is declared inside a class is an instance method. This kind of method requires an object of its class to created before it can be called.
6. Class Variables or static member variables - A static variable is common to all the instances (or objects) of the class because it is a class level variable
7. Constructor - A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created.
9.6.2 Java Scavenger Hunt 
Pipoy is a newbie in the Java programming language. He just heard that there are already ready-to-use APIs in Java that one could use in their programs, and he's eager to try them out. The problem is, Pipoy does not have a copy of the Java Documentation, and he also doesn't have an internet access, so there's no way for him to view the Java APIs. 
Your task is to help Pipoy look for the APIs (Application Programming Interface). You should state the class where the method belongs, the method declaration and a sample usage of the said method. 
For example, if Pipoy wants to know the method that converts a String to integer, your answer should be: 
Class: Integer 
Method Declaration: public static int parseInt( String value ) 
Sample Usage: 
String strValue = "100"; 
int value = Integer.parseInt( strValue ); 
Make sure that the snippet of code you write in your sample usage compiles and outputs the correct answer, so as not to confuse Pipoy. (Hint: All methods are in the java.lang package). In cases where you can find more methods that can accomplish the task, give only one. 
Now let's start the search! 
1.	Look for a method that checks if a certain String ends with a certain suffix. For example, if the given string is "Hello", the method should return true the suffix given is "lo", and false if the given suffix is "alp". 

- The Java String endsWith() method is used to check whether the string is ending with user-specified substring or not. Based on this comparison it returns the result in boolean value true if the specific suffix is matched or it returns false if the suffix does not match.

2.	Look for the method that determines the character representation for a specific digit in the specified radix. For example, if the input digit is 15, and the radix is 16, the method would return the character F, since F is the hexadecimal representation for the number 15 (base 10). 
- forDigit(int digit, int radix) determines the character representation for a specific digit in the specified radix. If the value of radix is not a valid radix, or the value of digit is not a valid digit in the specified radix, the null character ('\u0000') is returned.

3.	Look for the method that terminates the currently running Java Virtual Machine 4. Look for the method that gets the floor of a double value. For example, if I input a 3.13, the method should return the value 3. 
-The java.lang.Runtime.exit(int status) method terminates the currently running Java virtual machine by initiating its shutdown sequence. This method never returns normally. The argument serves as a status code; by convention, a nonzero status code indicates abnormal termination.

4.	Look for the method that determines if a certain character is a digit. For example, if I input '3', it returns the value true.
- The isDigit(char ch) method of Character class generally determines whether the given character is a digit or not. Generally, a character is considered as a digit if its general category given by Character. 
*/
  }
}
