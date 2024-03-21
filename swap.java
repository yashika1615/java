
import java.util.Scanner;

public class swap {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the indices to swap (separated by space): ");
        int index1 = sc.nextInt();
        int index2 = sc.nextInt();

        swap(arr, index1, index2);

        System.out.println("Array after swap is:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
              
        sc.close();
    }
}
