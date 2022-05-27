public class ReverseVowels {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseVowels(s));
    }

    static public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] str = s.toCharArray();

        while (i < j) {
            if (!isVowel(str[i])) {
                i++;
                continue;
            }

            if (!isVowel(str[j])) {
                j--;
                continue;
            }

            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;

            i++;
            j--;
        }

        return new String(str);

    }

    static public boolean isVowel(char val) {
        return val == 'a' || val == 'e' || val == 'i' || val == 'o' || val == 'u' || val == 'A' || val == 'E'
                || val == 'I' || val == 'O' || val == 'U';
    }

}