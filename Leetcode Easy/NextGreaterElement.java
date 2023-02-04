import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] nums1 = { 4, 1, 2 };
        int[] nums2 = { 1, 3, 4, 2 };
        int[] res = nextGreaterElement(nums1, nums2);
        for (int n : res) {
            System.out.print(n + " ");
        }
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        int index = 0;
        Map<Integer, Integer> hmap = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < nums2.length; i++) {

            while (!st.isEmpty() && nums2[i] > st.peek()) {
                hmap.put(st.pop(), nums2[i]);
            }
            st.push(nums2[i]);
        }

        for (int i = 0; i < res.length; i++) {
            res[index++] = hmap.getOrDefault(nums1[i], -1);
        }

        return res;
    }
}