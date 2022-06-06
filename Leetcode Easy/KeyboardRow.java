import java.util.*;

public class KeyboardRow {
    public static void main(String[] args) {
        String[] words = { "Hello", "Alaska", "Dad", "Peace" };
        String[] res = findWords(words);
        System.out.println(Arrays.toString(res));
    }

    static public String[] findWords(String[] words) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        Map<Character, Integer> map3 = new HashMap<>();

        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";

        for (int i = 0; i < firstRow.length(); i++) {
            map1.put(firstRow.charAt(i), i);
        }

        for (int i = 0; i < secondRow.length(); i++) {
            map2.put(secondRow.charAt(i), i);
        }

        for (int i = 0; i < thirdRow.length(); i++) {
            map3.put(thirdRow.charAt(i), i);
        }

        List<String> res = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int count1 = 0;
            int count2 = 0;
            int count3 = 0;

            for (int j = 0; j < word.length(); j++) {
                if (map1.get(word.charAt(j)) != null) {
                    count1++;
                } else if (map2.get(word.charAt(j)) != null) {
                    count2++;
                } else if (map3.get(word.charAt(j)) != null) {
                    count3++;
                }
            }

            if (count1 != 0 && count2 == 0 && count3 == 0) {
                res.add(word);
            } else if (count2 != 0 && count1 == 0 && count3 == 0) {
                res.add(word);
            } else if (count3 != 0 && count1 == 0 && count2 == 0) {
                res.add(word);
            }

        }

        return res.stream().toArray(String[]::new);

    }
}