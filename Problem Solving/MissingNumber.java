import java.util.*;
import java.io.*;

class MissingNumberInArray{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int range = sc.nextInt();
		int[] array = new int[range];
		System.out.println("Enter the numbers: ");
		for (int i = 0; i < range; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("The missing number is: "+ MissingNumber(array,range));
		
	}

	// static int MissingNumber(int[] array, int range){
	// 	int total = 0;
	// 	total = (range + 1) * (range + 2) / 2;
	// 	for (int j = 0; j < range; j++) 
	// 		total -= array[j];
	// 	return total;

	// }

	static int MissingNumber(int[] array, int range){
		
		int total = 1;
		for (int i = 2; i <= (range+1) ; i++ ) {
			total += i;
			total -= array[i-2];
		}
		return total;
	}
}