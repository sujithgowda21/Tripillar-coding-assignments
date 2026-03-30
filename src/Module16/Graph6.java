package Module16;
import java.util.*;

class Graph6{
    private int V;
    private LinkedList<Integer>[] adj;

    Graph6(int v) {
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

    void shortestPath(int src, int dest) {
        boolean[] visited = new boolean[V];
        int[] parent = new int[V];
        int[] distance = new int[V];
        Arrays.fill(parent, -1);
        Arrays.fill(distance, -1);

        Queue<Integer> queue = new LinkedList<>();
        visited[src] = true;
        distance[src] = 0;
        queue.add(src);

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int neighbor : adj[node]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    parent[neighbor] = node;
                    distance[neighbor] = distance[node] + 1;
                    queue.add(neighbor);

                    if (neighbor == dest) { // stop early if destination found
                        queue.clear();
                        break;
                    }
                }
            }
        }

        if (distance[dest] == -1) {
            System.out.println("No path exists between " + src + " and " + dest);
        } else {
            System.out.println("Shortest distance: " + distance[dest]);
            System.out.print("Path: ");
            printPath(parent, dest);
        }
    }

    void printPath(int[] parent, int node) {
        if (node == -1) return;
        printPath(parent, parent[node]);
        System.out.print(node + " ");
    }

    public static void main(String[] args) {
        Graph6 g = new Graph6(6);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(4, 5);

        g.shortestPath(0, 5);
    }
}
