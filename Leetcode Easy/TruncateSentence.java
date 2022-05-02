public class TruncateSentence {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        System.out.println(truncateSentence(s, k));
    }

    static public String truncateSentence(String s, int k) {
        String[] splittedArray = s.split(" ");

        String[] res = new String[k];
        for (int i = 0; i < k; i++) {
            res[i] = splittedArray[i];
        }
        return String.join(" ", res);
    }
}
