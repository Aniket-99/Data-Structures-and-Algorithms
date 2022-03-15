import java.util.*;

class MergeArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int end1 = m - 1;
        int end2 = n - 1;
        int end = m + n - 1;

        while (end2 >= 0) {
            if (end1 >= 0) {
                nums1[end--] = nums1[end1] > nums2[end2] ? nums1[end1--] : nums2[end2--];
            } else {
                nums1[end--] = nums2[end2--];
            }
        }
        Ssytem.out.println("The merge array is: ");
        Arrays.stream(nums1).forEach(System.out::print);
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };

        merge(nums1, 3, nums2, 3);

    }

}