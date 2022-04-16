public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 4, 3, 9, 8, 7 };

        int[] res = insertionSort(arr);
        System.out.println("The Sorted array is: ");
        for (int n : res) {

            System.out.print(n + " ");
        }
    }

    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    static int[] insertionSort(int[] arr) {
        int length = arr.length;

        for (int i = 1; i < length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}