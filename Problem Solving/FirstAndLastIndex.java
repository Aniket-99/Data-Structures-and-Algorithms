import java.util.*;
import java.io.*;

// Time complexity: O(logn)

public class FirstAndLastIndex{
	public static void main(String[] args) {
		//int[] arr = {4,5,7,8,8,8,8,9};
		//int target = 8;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of elements: ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.println("Enter the elements in sorted order: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the target element: ");
		int target = sc.nextInt();

		int[] result = new int[2];
		result[0] = findFirstIndex(arr, target);
		result[1] = findLastIndex(arr, target);

		System.out.println("The first index of "+target+ " is "+ result[0]);
		System.out.println("The last index of "+target+ " is "+ result[1]);
	}

	static int findFirstIndex(int[] arr, int target){
		int index = -1;
		int start = 0;
		int end = arr.length - 1;

		while(start <= end){
			int midPoint = start + (end - start)/2;
			if (arr[midPoint] >= target) {
				end = midPoint - 1;
			}
			else{
				start = midPoint + 1;
			}

			if (arr[midPoint] == target) {
				index = midPoint;
			}
		}
		return index;
	}

	static int findLastIndex(int[] arr, int target){
		int index = -1;
		int start = 0;
		int end = arr.length - 1;

		while(start <= end){
			int midPoint = start + (end - start)/2;

			if (arr[midPoint] <= target) {
				start = midPoint + 1;
			}
			else{
				end = midPoint - 1;
			}

			if (arr[midPoint] == target) {
				index = midPoint;
			}
		}
		return index;
	}


}