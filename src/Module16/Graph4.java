package Module16;
import java.util.*;

class Graph4 {
    private int V; // number of vertices
    private LinkedList<Integer>[] adj; // adjacency lists

    Graph4(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int src, int dest) {
        adj[src].add(dest);
        adj[dest].add(src); // because undirected graph
    }

    boolean DFSUtil(int node, boolean[] visited, int parent) {
        visited[node] = true;

        for (int neighbor : adj[node]) {
            if (!visited[neighbor]) {
                if (DFSUtil(neighbor, visited, node)) {
                    return true; // cycle found
                }
            } else if (neighbor != parent) {
                return true; // cycle detected
            }
        }
        return false;
    }

    boolean hasCycle() {
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (DFSUtil(i, visited, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Graph4 g = new Graph4(4);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 0); // creates a cycle
        g.addEdge(2, 3);

        if (g.hasCycle())
            System.out.println("Graph contains a cycle");
        else
            System.out.println("Graph does not contain a cycle");
    }
}
