import java.util.*;
public class WordCount {

    public static void main(String[] args) {
        String sentence = "Hello, this is a sentence!! Hello";
        Map<String, Integer> map = phrase(sentence);
        System.out.println(map);
    }

    public static Map<String, Integer> phrase(String sentence) {
        Map<String, Integer> result = new HashMap<>();
        List<String> wordList = makeListOfWords(sentence.split("[ .,;:]"));
        for (String word : wordList) {
            if (result.containsKey(word)) {
                int val = result.get(word);
                result.put(word, val + 1);
            } else {
                result.put(word, 1);
            }
        }
        return result;
    }
    private static String[] cutPhrase(String sentence) {
        return sentence.split("[ .,;:]");
    }
    private static List<String> makeListOfWords(String[] sentence) {
        
        String[] result = new String[sentence.length];
        for (int i = 0; i < sentence.length; i++) {
            result[i] = sentence[i].toLowerCase();
        }
        
        List<String> wordList = new ArrayList<>();
        for (String word : result) {
            if (word.startsWith("'")) {
                word = word.substring(1);
            }
            if (word.endsWith("'")) {
                word = word.substring(0, word.length() - 1);
            } 
            else if (!word.matches("[a-z]|[0-9]|'")) {
                for (int i = 0; i < word.length(); i++) {
                    if ((String.valueOf(word.charAt(i))).matches("[!&@$%^]")) {
                        word = word.substring(0, i);
                        continue;
                    }
                }
            }
            if (word.isBlank() || word.isEmpty()) {
                continue;
            }
            wordList.add(word.trim());
        }
        return wordList;
    }
}
