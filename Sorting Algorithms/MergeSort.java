public class MergeSort {
    public static void main(String[] args) {

        // Time complexity: O(nlogn)
        int[] arr = { 6, 3, 9, 5, 2, 8 };
        int n = arr.length;
        divide(arr, 0, n - 1);
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }

    static void divide(int[] arr, int startIdx, int endIdx) {

        if (startIdx >= endIdx) {
            return;
        }

        int mid = startIdx + (endIdx - startIdx) / 2;
        divide(arr, startIdx, mid);
        divide(arr, mid + 1, endIdx);
        conquer(arr, startIdx, mid, endIdx);
    }

    static void conquer(int[] arr, int startIdx, int mid, int endIdx) {
        int[] merged = new int[endIdx - startIdx + 1];

        int idx1 = startIdx;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= endIdx) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }
        while (idx2 <= endIdx) {
            merged[x++] = arr[idx2++];
        }

        for (int i = 0, j = startIdx; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

}