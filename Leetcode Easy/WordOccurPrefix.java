import java.util.*;

public class WordOccurPrefix {
    public static void main(String[] args) {
        String sentence = "i love eating burger";
        String searchWord = "burg";
        System.out.println(isPrefixOfWord(sentence, searchWord));
    }

    static public int isPrefixOfWord(String sentence, String searchWord) {
        // Not optimized

        // Map<Integer,String> mp = new HashMap<>();
        // String[] arr = sentence.split(" ");
        // int res = -1;

        // for(int i = 0; i < arr.length; i++){
        // mp.put(i+1,arr[i]);
        // }
        // for(Map.Entry<Integer,String> entry: mp.entrySet()){

        // String val = entry.getValue();

        // int idx = val.indexOf(searchWord);

        // if(idx == 0){
        // res = entry.getKey();
        // break;
        // }
        // }

        // return res;

        String[] arr = sentence.split(" ");
        for (int i = 1; i <= arr.length; i++) {
            if (arr[i - 1].startsWith(searchWord)) {
                return i;
            }
        }
        return -1;
    }
}