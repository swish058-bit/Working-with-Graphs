import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter graph file name: ");
        String fileName = keyboard.nextLine();

        GraphAdjList listGraph = new GraphAdjList();
        GraphAdjMatrix matrixGraph = new GraphAdjMatrix();

        try {
            Scanner fileScanner = new Scanner(new File(fileName));

            String startNode = null;

            while (fileScanner.hasNext()) {

                String from = fileScanner.next();
                String to = fileScanner.next();
                double weight = fileScanner.nextDouble();

                if (startNode == null) {
                    startNode = from;
                }

                listGraph.addEdge(from, to);
                matrixGraph.addEdge(from, to);
            }

            fileScanner.close();

            System.out.println();
            listGraph.bfs(startNode);

            System.out.println();
            matrixGraph.bfs(startNode);

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        keyboard.close();
    }
}