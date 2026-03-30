package Module16;
import java.util.*;

class Graph5 {
    private int V; // number of vertices
    private LinkedList<Integer>[] adj;

    Graph5(int v) {
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

    void DFSUtil(int node, boolean[] visited) {
        visited[node] = true;
        for (int neighbor : adj[node]) {
            if (!visited[neighbor]) {
                DFSUtil(neighbor, visited);
            }
        }
    }

    int countConnectedComponents() {
        boolean[] visited = new boolean[V];
        int count = 0;

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                DFSUtil(i, visited);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Graph5 g = new Graph5(6);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(3, 4);

        System.out.println("Number of connected components: " + g.countConnectedComponents());
    }
}
