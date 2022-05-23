public class HalvesAlike {
    public static void main(String[] args) {
        String s = "textbook";
        System.out.println(halvesAreAlike(s));
    }

    static public boolean halvesAreAlike(String s) {

        int mid = s.length() / 2;
        String[] parts = { s.substring(0, mid), s.substring(mid) };

        int v1 = 0;
        int v2 = 0;

        for (char k : parts[0].toCharArray()) {
            if (k == 'a' || k == 'e' || k == 'i' || k == 'o' || k == 'u' || k == 'A' || k == 'E' || k == 'I' || k == 'O'
                    || k == 'U') {
                v1 += 1;
            }
        }

        for (char k : parts[1].toCharArray()) {
            if (k == 'a' || k == 'e' || k == 'i' || k == 'o' || k == 'u' || k == 'A' || k == 'E' || k == 'I' || k == 'O'
                    || k == 'U') {
                v2 += 1;
            }
        }

        if (v1 == v2) {
            return true;
        } else {
            return false;
        }
    }

}