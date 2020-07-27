import java.util.*;
import java.io.*;

public class SumOfTwo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total elements in array1: ");
		int length1 = sc.nextInt();
		int[] array1 = new int[length1];

		System.out.println("Enter the elements of array1: ");
		for (int i = 0; i < length1; i++) {
			array1[i] = sc.nextInt();
		}

		System.out.println("Enter total elements in array2: ");
		int length2 = sc.nextInt();
		int[] array2 = new int[length2];

		System.out.println("Enter the elements of array2: ");
		for (int j = 0; j < length2; j++) {
			array2[j] = sc.nextInt();
		}

		System.out.println("Enter the sum to be found: ");
		int sumOfTwo = sc.nextInt();

		boolean result = sumOfTwo(array1, array2, sumOfTwo);
		System.out.println(result);
		
	}

	static boolean sumOfTwo(int[] array1, int[] array2, int sumOfTwo){
		HashSet<Integer> hashSetDiff = new HashSet<Integer>();

		for (int k = 0; k < array1.length; k++) {
			int difference = sumOfTwo - array1[k];
			hashSetDiff.add(difference);
		}

		for (int i = 0; i < array2.length; i++) {
			if (hashSetDiff.contains(array2[i])) {
				return true;
			}
		}
		return false;
	}
}