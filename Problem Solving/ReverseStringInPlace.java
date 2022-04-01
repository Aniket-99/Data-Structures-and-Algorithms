public class ReverseStringInPlace {
    public static void main(String[] args) {
        char[] word = { 'A', 'N', 'I', 'K', 'E', 'T' };

        if (word.length <= 0) {
            return;
        }

        int left = 0;
        int right = word.length - 1;

        while (left < right) {
            char temp = word[left];
            word[left] = word[right];
            word[right] = temp;
            right--;
            left++;
        }

        for (char val : word) {
            System.out.print(val + " ");
        }

    }

}