


import java.util.Scanner;

public class count_size_of_number {

    public static int count_length(int n){
        if(n==0) return 0;
         
        return count_length (n/10)+1;
    }
    public static void main(String[] args) {
        while(true){ 
             Scanner sc=new Scanner(System.in);
            System.out.println("nter the nth number you want to know size");
            int n=sc.nextInt();
           
            System.out.println( count_length(n));
            }
    }
}
