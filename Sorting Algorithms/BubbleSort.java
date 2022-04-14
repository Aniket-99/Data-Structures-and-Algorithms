public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 4, 3, 9, 8 };

        int[] res = bubbleSort(arr);
        System.out.println("The Sorted array is: ");
        for (int n : res) {

            System.out.print(n + " ");
        }
    }

    // Time Complexity: Worst: O(n^2), Best: O(n)
    // Space Complexity: O(1)
    static int[] bubbleSort(int[] arr) {
        int length = arr.length;
        boolean swapped;
        for (int i = 0; i < length - 1; i++) {
            swapped = false;
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (swapped == false) {
                break;
            }
        }
        return arr;
    }
}