public class AlternateString {
    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "pqrs";
        StringBuilder res = new StringBuilder();

        int n = word1.length();
        int m = word2.length();

        int i = 0;
        int j = 0;

        while (i < n && j < m) {
            res.append(word1.charAt(i));
            res.append(word2.charAt(j));
            i++;
            j++;
        }

        while (i < n) {
            res.append(word1.charAt(i++));
        }

        while (j < m) {
            res.append(word2.charAt(j++));
        }

        System.out.println("The Alternate String is " + res.toString());
    }
}