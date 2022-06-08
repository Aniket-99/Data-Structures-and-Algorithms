import java.util.*;

public class BFS {

    private int vertices;
    private LinkedList<Integer> adj[];

    public BFS(int vertices) {
        this.vertices = vertices;
        adj = new LinkedList[vertices];

        for (int i = 0; i < vertices; i++) {
            adj[i] = new LinkedList();
        }
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    public void findBFS(int s) {
        boolean visited[] = new boolean[vertices];

        visited[s] = true;

        LinkedList<Integer> queue = new LinkedList<>();

        queue.add(s);

        while (queue.size() != 0) {
            s = queue.poll();

            System.out.println(s + " ");

            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();

                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }

            }

        }

    }

    public static void main(String[] args) {
        BFS g = new BFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");

        g.findBFS(2);

    }

}