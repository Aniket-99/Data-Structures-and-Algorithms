import java.util.*;
import java.io.*;

public class RotateImage{
	public static void main(String[] args) {
		int[][] array = { {1,2,3}, {4,5,6}, {7,8,9} };

		System.out.println("The original array is: ");
		for(int[] row: array){
			System.out.println(Arrays.toString(row));
		}

		int length = array.length;
		for (int i = 0; i < length; i++) {
			for (int j = i; j < length; j++) {
				int temp = array[i][j];
				array[i][j] = array[j][i];
				array[j][i] = temp;
			}
		}

		// Printing transpose result
		System.out.println("The transpose of matrix is: ");
		for(int[] row: array){
			System.out.println(Arrays.toString(row));
		}

		for (int i = 0; i < length;i++ ) {
			for (int j = 0; j < (length/2);j++ ) {
				int temp = array[i][j];
				array[i][j] = array[i][length-1-j];
				array[i][length-1-j] = temp;
			}
		}

		// Printing rotate image
		System.out.println("The rotate of matrix is: ");
		for(int[] row: array){
			System.out.println(Arrays.toString(row));
		}

	}
}