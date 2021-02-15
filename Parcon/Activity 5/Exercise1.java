public class Exercise1{
    public static void main(String[] args){
        for(int i=0; i<8; ++i){
            System.out.printf("%s* * * * * * * *\n", (i % 2 != 0 ? " " : ""));
        }
    }
}
