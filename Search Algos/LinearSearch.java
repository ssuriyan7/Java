import java.util.*;

class LinearSearch {
	public static void main(String args[]) {
		int arr[] = {2, 4, 6, 8, 10, 20, 30, 40, 50, 60, 70, 80, 100}, target;
		Scanner s = new Scanner(System.in);
		for (int i: arr) {
			System.out.print(i + " ");
		}
		System.out.print("\nEnter the number you want to find in the above array: ");
		target = s.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				System.out.println("Found at position: " + i + "! :)");
			}
		} 
	}
}