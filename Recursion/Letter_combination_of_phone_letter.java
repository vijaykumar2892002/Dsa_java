import java.util.*;
public class Letter_combination_of_phone_letter {
   public static void possiblewords(String str,String ans,String arr[]){
    if(str.length()==0){
        System.out.println(ans);
        return;
    }
    String key=arr[str.charAt(0)-48];
    for(int i=0;i<key.length();i++){
        possiblewords(str.substring(1), ans+key.charAt(i), arr);
    }
   }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        String ans="";
        String arr[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        possiblewords(str,ans,arr);
    }
    }

