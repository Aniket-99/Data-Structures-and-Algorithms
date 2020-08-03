import java.util.*;
import java.io.*;

//Time complexity: O(n)
public class FirstDuplicate{
	public static void main(String[] args) {
		//int[] array = {1,1,3,3,4};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int length = sc.nextInt();
		int[] array = new int[length];

		System.out.println("Enter the elements: ");
		for (int i = 0; i < length; i++) {
			array[i] = sc.nextInt();
		}

		//int result = firstDuplicate(array);
		int result = firstDuplicateWithMinimumSpace(array);

		if (result!=-1) {
			System.out.println("The first duplicate element is: "+result);
		}
		else{
			System.out.println("No first duplicate element found in the array!");
		}

	}

	static int firstDuplicate(int[] array){
		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < array.length; i++) {
			if (set.contains(array[i])){
				return array[i];
			}
			else{
				set.add(array[i]);
			}
		}
		return -1;
	}

	static int firstDuplicateWithMinimumSpace(int[] array){
		for (int i = 0; i < array.length; i++) {
			if (array[Math.abs(array[i]) - 1] < 0) {
				return array[Math.abs(array[i])];
			}
			else{
				array[Math.abs(array[i]) - 1] = -array[Math.abs(array[i]) - 1];
			}
		}
		return -1;
	}
}