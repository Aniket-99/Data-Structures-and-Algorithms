import java.util.*;
import java.io.*;
class Kadane {
	public static void main(String[] args) {
		//int[] array = {-1, -2, 5, -1, -1, 12, 51, -3};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int range = sc.nextInt();
		int[] array = new int[range];
		System.out.println("Enter the elements: ");
		for (int j = 0;j<range;j++) {
			array[j] = sc.nextInt();
		}

		System.out.println("The maximum contiguous subarray sum is: " + maxSubArraySum(array));
	}


	static int maxSubArraySum(int[] array){
		int max_so_far = Integer.MIN_VALUE;
		int max_ending_here = 0;

		for (int i = 0; i < array.length; i++) {
			max_ending_here = max_ending_here + array[i];

			if (max_so_far < max_ending_here) {
				max_so_far = max_ending_here;
			}
			else if(max_ending_here < 0){
				max_ending_here = 0;
			}
		}

		return max_so_far;
	}
}