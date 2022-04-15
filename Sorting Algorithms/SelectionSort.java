public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 4, 3, 9, 8, 7 };

        int[] res = selectionSort(arr);
        System.out.println("The Sorted array is: ");
        for (int n : res) {

            System.out.print(n + " ");
        }
    }

    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    static int[] selectionSort(int[] arr) {
        int length = arr.length;

        for (int i = 0; i < length - 1; i++) {
            int minIndx = i;

            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[minIndx]) {
                    minIndx = j;
                }
                int temp = arr[minIndx];
                arr[minIndx] = arr[i];
                arr[i] = temp;
            }

        }
        return arr;
    }
}