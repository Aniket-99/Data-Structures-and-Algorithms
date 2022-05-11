import java.util.*;

public class JewelsInStones {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";

        System.out.println(numJewelsInStones(jewels, stones));
    }

    static public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        int res = 0;

        for (int i = 0; i < jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }

        for (int j = 0; j < stones.length(); j++) {
            if (set.contains(stones.charAt(j))) {
                res += 1;
            }
        }
        return res;

    }
}