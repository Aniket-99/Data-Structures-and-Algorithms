public class GoalParser {
    public static void main(String[] args) {

        String command = "G()(al)";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < command.length(); i++) {
            if (Character.isAlphabetic(command.charAt(i))) {
                sb.append(command.charAt(i));
            } else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                sb.append('o');
                i++;
                continue;
            }
        }

        System.out.println(sb.toString());
    }
}