import java.util.*;
public class Palindrome_of_string {
    public static boolean palindrome(String str ,int start,int end){
              if(start==end || end<start) return true;
              if(str.charAt(start)!=str.charAt(end)) return false;
              return palindrome(str, start+1, end-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){ 
            System.out.println("Enter the string");
            String str=sc.nextLine();
            System.out.println(palindrome(str, 0, str.length()-1));
            }
    }
}
