import java.util.*;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 4, 1 };
        int[] res = sortArrayByParity(arr);
        System.out.println(Arrays.toString(res));
    }

    public static int[] sortArrayByParity(int[] arr) {
        // Traditional approach - Consumes more space and time (Not Optimized)

        // int [] res = new int[arr.length];
        // int k = 0;

        // for(int i = 0; i < arr.length; i++){
        // if(arr[i] % 2 == 0){
        // res[k++] = arr[i];
        // }
        // }

        // for(int i = 0; i < arr.length; i++){
        // if(arr[i] % 2 != 0){
        // res[k++] = arr[i];
        // }
        // }

        // return res;

        // Optimized and in-place (Two pointers approach)
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] % 2 != 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                right--;
            } else {
                left++;
            }
        }
        return arr;

    }

}