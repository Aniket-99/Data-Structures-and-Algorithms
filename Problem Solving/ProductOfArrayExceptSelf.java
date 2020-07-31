import java.util.*;
import java.io.*;

public class ProductOfArrayExceptSelf{
	public static void main(String[] args) {
		//int[] arr = {1,2,3,4};
		//int N = arr.length;
		//int[] leftProducts = new int[N];
		//int[] rightProducts = new int[N];
		//leftProducts[0] = 1;
		//rightProducts[N-1] = 1;

	/* This approach takes O(n^3) time---------
		for (int i = 1; i < N;i++) {
			leftProducts[i] = arr[i-1] * leftProducts[i-1];
		}

		for (int j = N-2; j >= 0;j--) {
			rightProducts[j] = arr[j+1] * rightProducts[j+1];
		}

		for (int i = 0; i < N; i++) {
			resultArray[i] = leftProducts[i] * rightProducts[i];
		}

		for (int k = 0; k < N; k++) {
			System.out.print(resultArray[k] + " ");
		}
	*/	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int N = sc.nextInt();
		int[] arr = new int[N];
		int[] resultArray = new int[N];

		System.out.println("Enter the values: ");
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		
		/* This takes O(n) time because we are using a temp variable in order to simultaneously 
		multiply and storing the result instead of the above approach which uses two arrays*/

		resultArray[0] = 1;
		for (int i = 1; i < N ;i++ ) {
			resultArray[i] = arr[i-1] * resultArray[i-1]; 
		}

		int temp = 1;
		for (int i = N-1; i>=0; i--) {
			resultArray[i] = resultArray[i] * temp;
			temp = temp * arr[i];
		}

		for (int k = 0; k < N; k++) {
			System.out.print(resultArray[k] + " ");
		}

		sc.close();
	}
}