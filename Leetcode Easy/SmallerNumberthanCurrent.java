import java.util.*;

public class SmallerNumberthanCurrent {
    public static void main(String[] args) {
        int[] nums = { 8, 1, 2, 2, 3 };
        int[] res = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(res));
    }

    static public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            int count = 0;
            for (int k = 0; k < nums.length; k++) {
                if (nums[k] < nums[j]) {
                    count++;
                }
            }
            res[i++] = count;
        }
        return res;
    }

}