import java.util.*;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] nums = { -4, -1, 0, 3, 10 };
        int[] res = sortedSquares(nums);

        System.out.println(Arrays.toString(res));
    }

    static public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) Math.pow(nums[i], 2);
        }

        Arrays.sort(nums);
        return nums;
    }
}