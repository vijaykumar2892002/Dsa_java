
import java.util.*;
public class Balacnced_parentheses {
    public static void balparentheses(char arr[],int n,int i,int o,int c){
        if(i==arr.length){
            System.out.println(arr);
        }
        if(o<n){
            arr[i]='(';
            balparentheses(arr, n, i+1, o+1, c);
        }
        if(c<o){
            arr[i]=')';
            balparentheses(arr, n, i+1, o, c+1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the no. of parentheses(equal no of opening and closing parentheses)");
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        char arr[]=new char[n*2];
       balparentheses(arr,n,0,0,0);
    }
}
