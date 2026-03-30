package Module16;
import java.util.*;

class Graph7{
    private int V;
    private LinkedList<Integer>[] adj;

    Graph7(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int src, int dest) {
        adj[src].add(dest);
        adj[dest].add(src); // undirected graph
    }

    boolean isBipartite() {
        int[] color = new int[V];
        Arrays.fill(color, -1); // -1 means uncolored

        for (int start = 0; start < V; start++) {
            if (color[start] == -1) {
                Queue<Integer> queue = new LinkedList<>();
                queue.add(start);
                color[start] = 0;

                while (!queue.isEmpty()) {
                    int node = queue.poll();

                    for (int neighbor : adj[node]) {
                        if (color[neighbor] == -1) {
                            color[neighbor] = 1 - color[node]; // opposite color
                            queue.add(neighbor);
                        } else if (color[neighbor] == color[node]) {
                            return false; // conflict → not bipartite
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Graph7 g = new Graph7(4);
        g.addEdge(0, 1);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
        g.addEdge(2, 3);

        if (g.isBipartite())
            System.out.println("Graph is Bipartite");
        else
            System.out.println("Graph is NOT Bipartite");
    }
}
