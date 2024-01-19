import java.util.*;
public class Fibonacci {
    public static int fibonacci(int n){
      if(n==0) return 0;
      if (n==1) return 1;
     
      return fibonacci(n-1) + fibonacci(n-2);
      
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){ 
        System.out.println("enter the nth number you want to know in Fibonacci series");
        int n=sc.nextInt();
       
        System.out.println( fibonacci(n));
        }
    }
}
