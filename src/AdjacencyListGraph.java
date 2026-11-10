import java.util.*;

public class AdjacencyListGraph {

    private Map<String, List<String>> graph;

    public AdjacencyListGraph() {
        graph = new HashMap<>();
    }

    public void addEdge(String source, String destination) {

        graph.putIfAbsent(source, new ArrayList<>());
        graph.putIfAbsent(destination, new ArrayList<>());

        graph.get(source).add(destination);
        graph.get(destination).add(source); // bi-directional
    }

    public void bfs(String start) {

        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        visited.add(start);
        queue.offer(start);

        System.out.print("Adjacency List BFS: ");

        while (!queue.isEmpty()) {

            String current = queue.poll();
            System.out.print(current + " ");

            for (String neighbor : graph.get(current)) {

                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }

        System.out.println();
    }

    public Set<String> getVertices() {
        return graph.keySet();
    }
}