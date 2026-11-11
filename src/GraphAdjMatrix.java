import java.util.*;

public class GraphAdjMatrix {

    private ArrayList<String> vertices;
    private HashMap<String, Integer> vertexMap;
    private double[][] matrix;

    public GraphAdjMatrix() {
        vertices = new ArrayList<>();
        vertexMap = new HashMap<>();
        matrix = new double[50][50];
    }

    private void addVertex(String vertex) {
        if (!vertexMap.containsKey(vertex)) {
            vertexMap.put(vertex, vertices.size());
            vertices.add(vertex);
        }
    }

    public void addEdge(String from, String to) {
        addVertex(from);
        addVertex(to);

        int i = vertexMap.get(from);
        int j = vertexMap.get(to);

        matrix[i][j] = 1;
        matrix[j][i] = 1;
    }

    public void bfs(String start) {

        boolean[] visited = new boolean[vertices.size()];
        Queue<Integer> queue = new LinkedList<>();

        int startIndex = vertexMap.get(start);

        visited[startIndex] = true;
        queue.add(startIndex);

        System.out.println("Adjacency Matrix BFS:");

        while (!queue.isEmpty()) {

            int current = queue.poll();
            System.out.print(vertices.get(current) + " ");

            for (int i = 0; i < vertices.size(); i++) {
                if (matrix[current][i] != 0 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }

        System.out.println();
    }
}