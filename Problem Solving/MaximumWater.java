import java.util.*;
import java.io.*;

// Time complexity: O(n)
public class MaximumWater{
	public static void main(String[] args) {
		//int[] height = {1,8,6,2,5,4,8,3,7};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the array: ");
		int size = sc.nextInt();
		int[] height = new int[size];
		System.out.println("Enter the height: ");
		for(int i = 0; i < size; i++){
			height[i] = sc.nextInt();
		}

		int maxArea = 0;
		int leftPointer = 0;
		int rightPointer = height.length - 1;

		while(leftPointer < rightPointer){
			if (height[leftPointer] < height[rightPointer]) {
				maxArea = Math.max(maxArea, height[leftPointer] * (rightPointer - leftPointer));
				leftPointer+=1;
			}
			else{
				maxArea = Math.max(maxArea, height[rightPointer] * (rightPointer - leftPointer));
				rightPointer-=1;
			}
		}

		System.out.println("The maximum water in the container is: "+maxArea);



	}
}