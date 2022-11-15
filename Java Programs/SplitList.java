import java.util.*;

public class SplitList {
    public static void main(String args[]) {

        List<List<Integer>> resList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        // expected output = [[1,3], [5,7], [9]]
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        int k = 2;
        for (int i = 0; i < list.size();) {
            List<Integer> subList = new ArrayList<>();
            int j = 0;
            while (j < k && i < list.size()) {
                subList.add(list.get(i));
                j++;
                i++;

            }
            resList.add(subList);
        }

        // int i = 0;
        // while(i < list.size()){
        // List<Integer> subList = new ArrayList<>();
        // int j = 0;
        // while(j < k){
        // subList.add(list.get(i));
        // j++;
        // }
        // resList.add(subList);
        // i++;
        // }

        System.out.println(list);
        System.out.println(resList);
    }
}
