import java.util.*;

public class DFS {
    private int vertices;
    private LinkedList<Integer> adj[];

    public DFS(int v) {
        vertices = v;
        adj = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList();
        }
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    public void DFSTraversal(int v) {
        boolean[] visited = new boolean[vertices];
        DFSUtil(v, visited);
    }

    public void DFSUtil(int v, boolean visited[]) {
        visited[v] = true;
        System.out.println(v + " ");

        Iterator it = adj[v].listIterator();
        while (it.hasNext()) {
            int val = (int) it.next();
            if (!visited[val]) {
                DFSUtil(val, visited);
            }
        }

    }

    public static void main(String[] args) {
        DFS g = new DFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Depth First Traversal " + "(starting from vertex 2)");

        g.DFSTraversal(2);
    }

}