import java.util.*;
import java.io.*;

public class MaximumMoney {
	public static void main(String[] args) {
		//int[] nums = {1,2,3,1};
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of elements in array: ");
		int size = sc.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the values: ");
		for(int i = 0; i < size; i++){
			nums[i] = sc.nextInt();
		}
		int result = maximumMoney(nums);
		System.out.println("The maximum money is: "+result);
	}

	static int maximumMoney(int[] nums){

		int[] dp = new int[nums.length + 1];
		dp[0] = 0;
		dp[1] = nums[0];

		for(int i = 1; i < nums.length; i++){
			dp[i+1] = Math.max(dp[i], dp[i-1] + nums[i]);
		}
		return dp[nums.length];
	}
}