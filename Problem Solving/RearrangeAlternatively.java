import java.util.*;
import java.io.*;

class RearrangeArrayAlternatively{
	public static void main(String[] args) {
		//int[] array = {1,2,3,4,5,6};

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in array: ");
		int length = sc.nextInt();
		int[] temp = new int[length];
		int[] array = new int[length];

		System.out.println("Enter the values in ascending order: ");
		for (int i = 0; i < length; i++ ) {
			array[i] = sc.nextInt();
		}

		int small = 0, large = length-1;
		boolean flag = true;

		for (int i = 0; i < length ;i++ ) {
			if (flag) {
				temp[i] = array[large--];
			}
			else{
				temp[i] = array[small++];
			}

			flag = !flag;
		}
		System.out.println("The original array is: ");
		for(int i = 0;i < length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println("The alternative array is:");

		for(int i = 0;i < length;i++){
			System.out.print(temp[i]+" ");
		}

	}
}