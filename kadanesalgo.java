import java.util.Scanner;

class KAlgo {
    int numElements;
    int[] arr;
    Scanner sc = new Scanner(System.in);

    KAlgo() {
        numElements = sc.nextInt();
        arr = new int[numElements];
        for (int i = 0; i < numElements; i++)
            arr[i] = sc.nextInt();
    }

    void maxSum() {
        int sum = 0, maxSum = Integer.MIN_VALUE;
        int start = 0; // Fix: declare 'start' variable
        int ansStart = 0, ansEnd = 0;

        for (int i = 0; i < numElements; i++) {
            if (sum == 0)
                start = i;
            sum += arr[i];
            if (sum > maxSum) {
                maxSum = sum;
                ansStart = start;
                ansEnd = i;
            }
            if (sum <= 0)
                sum = 0;
        }

        System.out.println("Max Sum is: " + maxSum);
        for (int i = ansStart; i <= ansEnd; i++)
            System.out.print(arr[i] + " "); // Fix: Use print instead of println for array elements
        System.out.println(); // Add a new line after printing the array elements
    }
}

public class kadanesalgo {
    public static void main(String[] args) {
        KAlgo k = new KAlgo();
        k.maxSum();
    }
}

