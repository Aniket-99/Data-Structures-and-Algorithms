public class ShortestUnsortedArray {
    public static void main(String[] args) {
        int[] nums = { 2, 6, 4, 8, 10, 9, 15 };
        int res = findUnsortedSubarray(nums);
        System.out.println("The shortest unsorted array lebgth is: " + res);
    }

    static public int findUnsortedSubarray(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean flag = false;
        int len = nums.length;

        for (int i = 1; i < len; i++) {
            if (nums[i] < nums[i - 1]) {
                flag = true;
            }
            if (flag) {
                min = Math.min(min, nums[i]);
            }
        }

        flag = false;

        for (int j = len - 2; j >= 0; j--) {
            if (nums[j] > nums[j + 1]) {
                flag = true;
            }

            if (flag) {
                max = Math.max(max, nums[j]);
            }
        }
        int left, right;

        for (left = 0; left < len; left++) {
            if (min < nums[left])
                break;
        }

        for (right = len - 1; right >= 0; right--) {
            if (max > nums[right])
                break;
        }

        return right - left < 0 ? 0 : right - left + 1;

    }
}