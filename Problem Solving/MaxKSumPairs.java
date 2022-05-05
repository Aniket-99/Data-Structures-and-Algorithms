import java.util.*;

public class MaxKSumPairs {
    public static void main(String[] args) {
        int[] nums = { 3, 1, 3, 4, 3 };
        int k = 6;
        System.out.println("Max Operations is: " + maxOperations(nums, k));
    }

    static public int maxOperations(int[] nums, int k) {
        int res = 0;
        int left = 0;
        int right = nums.length - 1;
        Arrays.sort(nums);

        while (left < right) {
            if ((nums[left] + nums[right]) < k) {
                left++;
            } else if ((nums[left] + nums[right]) > k) {
                right--;
            } else {
                left++;
                right--;
                res++;
            }
        }
        return res;
    }
}