import java.util.*;

public class GraphAdjList {
    private HashMap<String, ArrayList<String>> adjList;

    public GraphAdjList() {
        adjList = new HashMap<>();
    }

    public void addEdge(String from, String to) {
        adjList.putIfAbsent(from, new ArrayList<>());
        adjList.putIfAbsent(to, new ArrayList<>());

        adjList.get(from).add(to);
        adjList.get(to).add(from); // undirected graph
    }

    public void bfs(String start) {
        HashSet<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        visited.add(start);
        queue.add(start);

        System.out.println("Adjacency List BFS:");

        while (!queue.isEmpty()) {
            String current = queue.poll();
            System.out.print(current + " ");

            for (String neighbor : adjList.get(current)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }
}