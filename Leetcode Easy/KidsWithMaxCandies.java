import java.util.*;

public class KidsWithMaxCandies {
    public static void main(String[] args) {
        int[] candies = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;

        List<Boolean> res = kidsWithCandies(candies, extraCandies);
        System.out.println(res);
    }

    static public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int max = Arrays.stream(candies).max().getAsInt();

        for (int i = 0; i < candies.length; i++) {
            int sum = candies[i] + extraCandies;
            if (sum >= max) {
                res.add(true);
            } else {
                res.add(false);
            }
        }

        return res;
    }
}