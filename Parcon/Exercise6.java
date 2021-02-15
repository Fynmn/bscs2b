import java.util.Scanner; 
public class Exercise6{
public static void main(String args[]){
Scanner sc=new Scanner(System.in); //Scanner class in java
System.out.print("Enter the rows you want: ");
int rows=sc.nextInt();//get input from user
System.out.println("");
for(int i=1; i<=rows; i++){
   for(int j=0; j<rows-i; j++){//create initial space for pyramid shape
       System.out.print(" ");
}
for(int k=1; k<i; k++){
       System.out.print(k);//create right half 
}
for(int l=i; l>=1; l--){
       System.out.print(l);//create left half 
}
System.out.print("\n");
        }
    }
}
