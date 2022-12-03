import java.util.*;

public class SortByFrequency {
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }

    public static String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();

        // Counting frequency
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Sorting By Value
        map = sortByValue(map);

        StringBuilder sb = new StringBuilder();

        for (Map.Entry<Character, Integer> val : map.entrySet()) {
            for (int i = 0; i < val.getValue(); i++) {
                sb.append(val.getKey());
            }
        }

        return sb.toString();

    }

    public static Map<Character, Integer> sortByValue(Map<Character, Integer> map) {

        List<Map.Entry<Character, Integer>> list = new LinkedList<>(map.entrySet());

        Collections.sort(list, new Comparator<>() {
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        Map<Character, Integer> hm = new LinkedHashMap<>();

        for (Map.Entry<Character, Integer> val : list) {
            hm.put(val.getKey(), val.getValue());
        }

        return hm;

    }
}