public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "hello world ";

        String[] str = s.split("\\s+");

        String ans = "";

        for (int i = str.length - 1; i >= 0; i--) {
            ans += str[i];
            ans += " ";
        }

        System.out.println(ans.trim());
    }
}