import java.util.Scanner;;

public class Sum_of_all_element_in_array {
    public static int sumelement(int arr[], int sum, int index) {
        if (index == arr.length)
            return sum;
        sum += arr[index];
        return sumelement(arr, sum, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the size of array");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter the array ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int sum = 0;
            System.out.println(sumelement(arr, sum, 0));
        }
    }
}
