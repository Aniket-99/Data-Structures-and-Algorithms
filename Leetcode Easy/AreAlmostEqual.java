import java.util.*;

public class AreAlmostEqual {
    public static void main(String[] args) {
        // Check if One String Swap Can Make Strings Equal
        String s1 = "bank";
        String s2 = "kanb";

        System.out.println(areAlmostEqual(s1, s2));
    }

    public static boolean areAlmostEqual(String s1, String s2) {

        int count = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) {
            char val1 = s1.charAt(i);
            char val2 = s2.charAt(i);

            if (val1 != val2) {
                list.add(i);
                count++;
            }

            if (count > 2) {
                return false;
            }
        }

        if (count == 2) {
            int pos1 = list.get(0);
            int pos2 = list.get(1);

            if (s1.charAt(pos1) == s2.charAt(pos2) && s1.charAt(pos2) == s2.charAt(pos1)) {
                return true;
            }

        }

        if (count == 0) {
            return true;
        }

        return false;
    }
}