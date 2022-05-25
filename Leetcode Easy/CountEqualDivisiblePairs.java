public class CountEqualDivisiblePairs {
    public static void main(String[] args) {
        int[] nums = { 3, 1, 2, 2, 2, 1, 3 };
        int k = 2;
        System.out.println(countPairs(nums, k));
    }

    static public int countPairs(int[] nums, int k) {
        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && (i * j) % k == 0)
                    res++;
            }
        }

        return res;

    }
}