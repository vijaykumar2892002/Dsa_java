import java.util.Scanner;

public class Reverse_a_string {
     public static String reverse(String str,int end ,String string){
        if(end<0) return string;
        string= string+str.charAt(end);
        return reverse(str, end-1, string);
     }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        while(true){ 
        System.out.println("Enter the string");
        String str=sc.nextLine();
        String string="";
        System.out.println(reverse(str, str.length()-1, string) );
        }
    }
}
