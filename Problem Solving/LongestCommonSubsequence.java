import java.io.*;
import java.util.*;

// An example of solving LongestCommonSubsequence using dynamic programming approach

public class LongestCommonSubsequence{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1,s2;
		System.out.println("Enter first string: ");
		s1 = sc.nextLine();
		System.out.println("Enter second string: ");
		s2 = sc.nextLine();

		char[] array1 = s1.toCharArray();
		char[] array2 = s2.toCharArray();
		int i = array1.length;
		int j = array2.length;

		int lcs = LCS(array1, array2, i, j);
		System.out.println("The longest common subsequence is: "+lcs);

	}


	static int LCS(char[] array1 , char[] array2, int i, int j){
		if (i == 0 || j == 0) {
			return 0;
		}
		else if (array1[i-1] == array2[j-1]) {
			return 1 + LCS(array1, array2, i-1, j-1);
		}
		else{
			return Math.max(LCS(array1, array2,i-1,j),LCS(array1,array2,i,j-1));
		}
	}
}