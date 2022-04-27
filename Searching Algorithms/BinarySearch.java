public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 2, 6, 7, 10, 99 };
        int res = binarySearch(arr, 6);
        if (res == -1) {
            System.out.println("Value not found");
        } else {
            System.out.println("Value found at index: " + res);
        }
    }

    static int binarySearch(int[] arr, int val) {
        int low = 0;
        int high = arr.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == val) {
                return mid;
            }

            if (arr[mid] < val) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;

    }
}