import java.util.*;

public class Shift2D {
    public static void main(String[] args) {
        int[][] grid = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int k = 1;
        List<List<Integer>> res = shift2D(grid, k);
        System.out.print(res);
    }

    static List<List<Integer>> shift2D(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;
        k = k % total;

        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> sub = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                int shiftidx = findShiftIndex(i, j, n, k, total);
                sub.add(grid[shiftidx / n][shiftidx % n]);
            }
            res.add(sub);
        }
        return res;
    }

    static int findShiftIndex(int i, int j, int col, int k, int total) {
        return (i * col + j + total - 1) % total;
    }

}