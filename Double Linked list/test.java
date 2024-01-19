
 


public class test {
      
  public static void longSubarrWthSumDivByK(int a[], int n, int k)
    {
        int  start=0;
        int  end=a.length-1;
        int sum=0;
        int count=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        while(start<=end){
            if(sum%3!=0){
                if(start%2==0){
                    sum-=a[start];
                    start++;
                }
                else{
                    sum-=a[end];
                    end--;
                }
            }
            else{
                System.out.println(start);
                System.out.println(end);
                break;
            }
        }
        while(start<=end){
            count++;
            start++;
         
        }
        System.out.println("kuyrttfygj");
    System.out.println(count);
        // Complete the function
       
    }
    public static void main(String[] args) {
        int arr[]= {2, 7, 6, 1, 4, 5};
        longSubarrWthSumDivByK(arr, 6, 3);

        
    }
}
