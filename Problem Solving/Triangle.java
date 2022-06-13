import java.util.*;

public class Triangle {
    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        List<Integer> l = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<Integer> l3 = new ArrayList<>();
        l.add(2);
        l2.add(3);
        l2.add(4);
        l3.add(6);
        l3.add(5);
        l3.add(7);
        triangle.add(l);
        triangle.add(l2);
        triangle.add(l3);

        System.out.println(minimumTotal(triangle));

    }

    static public int minimumTotal(List<List<Integer>> triangle) {
        for (int i = triangle.size() - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int min = Math.min(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1));
                int sum = min + triangle.get(i).get(j);
                triangle.get(i).set(j, sum);
            }
        }

        return triangle.get(0).get(0);
    }
}