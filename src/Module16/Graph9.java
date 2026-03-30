package Module16;
import java.util.*;

class Graph9{
    private int V;
    private LinkedList<Integer>[] adj;

    Graph9(int v) {
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

    int countVertices() {
        return V;
    }

    int countEdges() {
        int edgeCount = 0;
        for (int i = 0; i < V; i++) {
            edgeCount += adj[i].size();
        }
        return edgeCount / 2; // divide by 2 for undirected graph
    }

    public static void main(String[] args) {
        Graph9 g = new Graph9(5);
        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        System.out.println("Number of vertices: " + g.countVertices());
        System.out.println("Number of edges: " + g.countEdges());
    }
}
