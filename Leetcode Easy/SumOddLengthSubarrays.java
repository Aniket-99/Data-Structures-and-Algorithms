public class SumOddLengthSubarrays {
    public static void main(String[] args) {
        int[] nums = { 1, 4, 2, 5, 3 };
        System.out.println(sumOfOddLengthSubarrays(nums));
    }

    public static int sumOfOddLengthSubarrays(int[] nums) {
        int res = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                if ((j - i + 1) % 2 == 0) {
                    continue;
                }
                for (int k = i; k <= j; k++) {
                    res += nums[k];
                }
            }
        }

        return res;
    }
}