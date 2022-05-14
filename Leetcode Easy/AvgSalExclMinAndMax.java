import java.util.*;

public class AvgSalExclMinAndMax {
    public static void main(String[] args) {
        int[] salary = { 4000, 3000, 1000, 2000 };
        System.out.println("The average salary is: " + average(salary));
    }

    static public double average(int[] salary) {
        double sum = 0;
        int div = 0;

        int max = Arrays.stream(salary).max().getAsInt();
        int min = Arrays.stream(salary).min().getAsInt();

        for (int val : salary) {
            if (val != max && val != min) {
                div++;
                sum += val;
            }
        }

        return sum / div;
    }
}