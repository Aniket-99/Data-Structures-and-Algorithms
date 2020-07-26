import java.util.*;
import java.io.*;

public class SortedSquaredArray{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalElements;
		System.out.println("Enter the length of array: ");
		totalElements = sc.nextInt();

		if (totalElements <= 0) {
			System.out.println("Please enter element greater than 0!");
			System.exit(1);
		}
		int[] array = new int[totalElements];

		System.out.println("Enter the values: ");
		for (int i = 0; i < totalElements; i++) {
			array[i] = sc.nextInt();
		}

		// Sorted square array
		/* Take two pointers start and end and compare both, if start value is greater square it, increement the start
		and store it in new array and vice versa if end value is greater*/
		int[] result = new int[totalElements];
		int start = 0; 
		int end = array.length - 1;
		for (int j = end; j >= 0 ;j-- ) {
			if (Math.abs(array[start]) > array[end]) {
				result[j] = array[start] * array[start];
				start++;
			}
			else{
				result[j] = array[end] * array[end];
				end--;
			}
		}
		System.out.println("The sorted squared array is: ");
		for (int k = 0; k < result.length;k++ ) {
			System.out.print(result[k]+ " ");
		}
		sc.close();
	}
}