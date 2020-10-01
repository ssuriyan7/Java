import java.util.*;

class QuickSort {

    static void swap(int[] arr, int i, int j) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int low, int high) {
        int left, right, p;
        p = low;
        left = low + 1;
        right = high;

        // for asc sort
        while (left < right) {
            while (left < arr.length && arr[left] < arr[p]) {
                left++;
            }
            while (right >= 0 && arr[right] > arr[p]) {
                right--;
            }
            /*
             * swap the value that's larger(where left is stuck) than p to the smaller(where right is stuck) value and
             * continue traversing the values in between
             */
            if (left < right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        
        //bringing pivot to its correct position
        if (arr[p] > arr[right]) {
            swap(arr, p, right);
        }
        return right;
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    public static void main(String[] args) {
        int length;
        int[] arr;
        Scanner s = new Scanner(System.in);
        System.out.print("Length of the input array: ");
        length = s.nextInt();
        while (length <= 0) {
            System.out.println("Invalid!");
            System.out.print("Length of the input array: ");
            length = s.nextInt();
        }
        arr = new int[length];

        for (int i = 0; length > 0 && i < length; i++) {
            System.out.print("Enter a number: ");
            arr[i] = s.nextInt();
        }

        System.out.print("\nUnsorted array: ");
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);

        System.out.print("\nSorted array  : ");
        System.out.println(Arrays.toString(arr));

        System.out.println("\nThe End!");

    }
}