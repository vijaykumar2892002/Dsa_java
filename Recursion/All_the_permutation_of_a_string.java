
import java.util.*;
public class All_the_permutation_of_a_string {
    public static void swap (char arr[],int a,int b){
        char temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }
    public static void permutation(char arr[],int fixed){
        if(fixed==arr.length-1){
            System.out.println(arr);
            return;
        }
        for(int i=fixed;i<arr.length;i++){
            swap(arr,i,fixed);
            permutation(arr, fixed+1);
            swap(arr,i,fixed);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        permutation(str.toCharArray(),0);
    }
}
