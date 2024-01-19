import java.util.*;
public class sum_of_digit_of_number {
    public static int sum_of_digit(int n){
        if(n==0) return 0;
         int sum=n%10;
        return sum_of_digit(n/10)+sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter the nth number you want to calculate sum");
            int n=sc.nextInt();
           
            System.out.println(sum_of_digit(n));
            }
    }

