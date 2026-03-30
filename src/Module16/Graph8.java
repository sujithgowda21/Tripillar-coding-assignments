package Module16;
import java.util.*;

class Graph8 {
    private int V;
    private LinkedList<Integer>[] adj;

    Graph8(int v) {
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

    void printNeighbors(int node) {
        System.out.print("Neighbors of " + node + ": ");
        for (int neighbor : adj[node]) {
            System.out.print(neighbor + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Graph8 g = new Graph8(5);
        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        g.printNeighbors(1); // Example: print neighbors of node 1
    }
}
