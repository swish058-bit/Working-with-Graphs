import java.util.*;

public class AdjacencyMatrixGraph {

    private boolean[][] matrix = new boolean[26][26];

    public void addEdge(String source, String destination) {

        int row = source.charAt(0) - 'A';
        int col = destination.charAt(0) - 'A';

        matrix[row][col] = true;
        matrix[col][row] = true;   // bidirectional graph
    }

    public void bfs(String start) {

        boolean[] visited = new boolean[26];
        Queue<Integer> queue = new LinkedList<>();

        int startIndex = start.charAt(0) - 'A';

        visited[startIndex] = true;
        queue.add(startIndex);

        System.out.print("Adjacency Matrix BFS: ");

        while (!queue.isEmpty()) {

            int current = queue.remove();

            System.out.print((char)(current + 'A') + " ");

            for (int i = 0; i < 26; i++) {

                if (matrix[current][i] && !visited[i]) {

                    visited[i] = true;
                    queue.add(i);
                }
            }
        }

        System.out.println();
    }
}