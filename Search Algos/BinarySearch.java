import java.util.*;

class BinarySearch {

	public static int binarySearch(int[] arr, int target, int startIndex, int endIndex) {
		int mid = (startIndex + endIndex) / 2;
		if(arr[mid] == target) 
			return mid;
		else if (target < arr[mid] && ((mid - 1) >= 0)) 
			return binarySearch(arr, target, startIndex, mid - 1);
		else if (target > arr[mid] && (mid + 1) < arr.length)
			return binarySearch(arr, target, mid + 1, endIndex); 
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {2, 3, 4, 5, 6, 7, 8, 9}, target, position;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number you wish to find in the array: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		target = scanner.nextInt();
		position = binarySearch(arr, target, 0, arr.length - 1);

		if(position != -1)
			System.out.println("Found at: " + position + "! :)");
		else
			System.out.println("Not Found! :(");
	}
}