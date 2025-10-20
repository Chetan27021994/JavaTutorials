import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];


        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }


        System.out.print("Enter value of k: ");
        int k = scanner.nextInt();

        if (k > n || k <= 0) {
            System.out.println("Invalid value of k.");
            return;
        }


        int[] result = findKLargest(arr, k);

        // Output the k largest elements
        System.out.println("The " + k + " largest elements are:");
        Arrays.sort(result);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] findKLargest(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }


        int[] result = new int[k];
        int i = 0;
        for (int num : minHeap) {
            result[i++] = num;
        }

        return result;
    }
}
