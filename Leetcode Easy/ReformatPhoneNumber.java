import java.util.*;

public class ReformatPhoneNumber {
    public static void main(String[] args) {
        String number = "1-23-45 6";
        StringBuilder res = new StringBuilder();
        String s = number.replaceAll("([^0-9]|\\s)+", "");
        List<Character> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }

        while (list.size() > 0) {
            if (list.size() > 4) {
                for (int i = 0; i < 3; i++) {
                    res.append(list.get(0));
                    list.remove(0);
                }

                res.append('-');
            }

            else if (list.size() == 4) {
                for (int i = 0; i < 2; i++) {
                    res.append(list.get(0));
                    list.remove(0);
                }

                res.append('-');
            } else {
                res.append(list.get(0));
                list.remove(0);
            }
        }

        System.out.println(res.toString());
    }
}