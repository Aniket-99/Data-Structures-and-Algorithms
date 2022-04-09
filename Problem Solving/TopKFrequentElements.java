import java.util.*;
import java.util.stream.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        int k = 2;
        int[] res = topKFrequent(nums, k);

        for (int n : res) {
            System.out.print(n + " ");
        }
    }

    static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int num : nums) {
            if (hm.containsKey(num)) {
                hm.put(num, hm.get(num) + 1);
            } else {
                hm.put(num, 1);
            }
        }

        List<Integer> res = hm.entrySet().stream().sorted((n1, n2) -> n2.getValue().compareTo(n1.getValue())).limit(k)
                .map(i -> i.getKey()).collect(Collectors.toList());

        int[] resultArr = new int[res.size()];

        for (int i = 0; i < res.size(); i++) {
            resultArr[i] = res.get(i);
        }

        return resultArr;

    }
}