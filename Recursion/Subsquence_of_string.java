import java.util.*;
public class Subsquence_of_string {
  public  static void subsquence(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        subsquence(str.substring(1), ans+str.charAt(0));
        subsquence(str.substring(1), ans);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        String ans="";
        subsquence(str,ans);
    }
}
