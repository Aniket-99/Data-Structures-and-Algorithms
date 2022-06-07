import java.util.*;

public class DigitCount {
    public static void main(String[] args) {
        String num = "1210";
        System.out.println(digitCount(num));
    }

    static public boolean digitCount(String num) {

        Map<Integer, Integer> map = new HashMap<>();

        for (char val : num.toCharArray()) {
            map.put(Character.getNumericValue(val), map.getOrDefault(Character.getNumericValue(val), 0) + 1);
        }

        for (int i = 0; i < num.length(); i++) {
            if (map.containsKey(i) && Character.getNumericValue(num.charAt(i)) != map.get(i)) {
                return false;
            } else if (!map.containsKey(i) && Character.getNumericValue(num.charAt(i)) != 0) {
                return false;
            }
        }

        return true;
    }
}