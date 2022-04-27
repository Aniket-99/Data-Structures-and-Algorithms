import java.util.*;

public class RunningSum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int[] res = runningSum(arr);
        for (int n : res) {
            System.out.println(n + " ");
        }
    }

    // Time Compelxity: O(n)
    static int[] runningSum(int[] arr) {
        int res[] = new int[arr.length];

        res[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            res[i] = res[i - 1] + arr[i];
        }

        return res;
    }

}