import java.util.*;

public class FindRestaurant {
    public static void main(String[] args) {
        String[] list1 = { "Shogun", "Tapioca Express", "Burger King", "KFC" };
        String[] list2 = { "Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun" };
        String[] res = findRestaurant(list1, list2);
        System.out.print(Arrays.toString(res));
    }

    static String[] findRestaurant(String[] list1, String[] list2) {

        // Declare a HashMap
        Map<String, Integer> mp = new HashMap<>();

        // Declare an ArrayList to add items which matched
        ArrayList<String> res = new ArrayList<>();

        // Declare a Min Index
        int minIndx = Integer.MAX_VALUE;

        // Loop through list1 and store its data and index in key value pair in HashMap
        for (int i = 0; i < list1.length; i++) {
            mp.put(list1[i], i);
        }

        // Loop through the second list and check whether it is there in map
        for (int i = 0; i < list2.length; i++) {
            if (mp.containsKey(list2[i])) {
                int sum = i + mp.get(list2[i]);
                if (sum < minIndx) {
                    minIndx = sum;
                    res.clear();
                    res.add(list2[i]);
                } else if (minIndx == sum) {
                    res.add(list2[i]);
                }
            }
        }

        // convert arraylist to array and return
        String[] common = new String[res.size()];
        common = res.toArray(common);
        return common;

    }

}