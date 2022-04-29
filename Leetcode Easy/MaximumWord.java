public class MaximumWord {
    public static void main(String[] args) {
        String[] sentences = { "alice and bob love leetcode", "i think so too", "this is great thanks very much" };
        System.out.println("The maximum word foudn is : " + mostWordsFound(sentences));
    }

    static public int mostWordsFound(String[] sentences) {
        int max = 0;

        for (int i = 0; i < sentences.length; i++) {
            int len = sentences[i].split(" ").length;
            max = Math.max(max, len);
        }
        return max;
    }
}