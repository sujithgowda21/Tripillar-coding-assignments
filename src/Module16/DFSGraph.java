package Module16;
import java.util.*;

class DFSGraph {
    private int V; // number of vertices
    private LinkedList<Integer>[] adj; // adjacency lists

    DFSGraph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int src, int dest) {
        adj[src].add(dest);
    }

    void DFSUtil(int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : adj[node]) {
            if (!visited[neighbor]) {
                DFSUtil(neighbor, visited);
            }
        }
    }

    void DFS(int start) {
        boolean[] visited = new boolean[V];
        DFSUtil(start, visited);
    }

    public static void main(String[] args) {
        DFSGraph g = new DFSGraph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("DFS starting from vertex 2:");
        g.DFS(2);
    }
}
