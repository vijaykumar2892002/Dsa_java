import java.util.*;
public class josephies_problem {
    public static int jos(int n,int k){
        if(n==1) return 0;
        return (jos(n-1, k)+k)%n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number of people");
            int n=sc.nextInt();
            System.out.println("Enter the position(but in array it is k-1 postion) who will kill");
            int k=sc.nextInt();
            
            System.out.println(jos(n,k)+1);

            }
    }

