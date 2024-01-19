
import java.util.*;
public class Factorial{
    Scanner sc=new Scanner(System.in);
    public static int factorial(int n){
          if(n==1){ 
            return 1 ; }

            return  n * factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){ 
        System.out.println("enter the number you want to know factorial");
        int n=sc.nextInt();
       
        System.out.println( factorial(n));
        }

    }
}
