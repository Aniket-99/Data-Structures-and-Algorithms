import java.util.*;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6 };
        int[] res = shuffle(nums, 3);
        System.out.println(Arrays.toString(res));
    }

    // i/p - [1,2,3,4,5,6] n = 3
    // o/p - [1,4,2,5,3,6]
    static public int[] shuffle(int[] nums, int n) {
        int res[] = new int[2 * n];
        int i = 0;
        int j = n;
        int current = 0;

        while (i < n) {
            res[current] = nums[i];
            current++;
            i++;
            res[current] = nums[j];
            j++;
            current++;
        }

        return res;
    }
}