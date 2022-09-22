public class ReverseStringIII {
    public static void main(String[] args) {
        String s = "God's Plan";

        char[] toCharArray = s.toCharArray();

        int lastSpaceIndex = -1;

        int length = s.length();
        for (int strIndex = 0; strIndex <= length; strIndex++) {
            if (strIndex == length || toCharArray[strIndex] == ' ') {
                int startIndex = lastSpaceIndex + 1;
                int endIndex = strIndex - 1;

                while (startIndex < endIndex) {
                    char temp = toCharArray[startIndex];
                    toCharArray[startIndex] = toCharArray[endIndex];
                    toCharArray[endIndex] = temp;
                    startIndex++;
                    endIndex--;
                }
                lastSpaceIndex = strIndex;
            }
        }

        System.out.println(new String(toCharArray));

    }
}