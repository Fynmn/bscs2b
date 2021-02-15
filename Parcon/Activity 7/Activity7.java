  
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class Activity7{
    
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> Array = new ArrayList<>();
        
        System.out.println("Enter the size of an Array: ");
        int size = input.nextInt();
        
        System.out.println("Enter " + size + " Values:");
        for (int i = 0; i < size; i++) {
            int myArray = input.nextInt();
            Array.add(myArray);
            
            Collections.sort(Array);
        }
         System.out.println("Largest Element: " 
         +  Array.get(size - 1) + "    Smallest Element: " + Array.get(0));
        }
    }
