import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GraphTest {

    @org.testng.annotations.Test
    void testAdjListGraphCreation() {
        GraphAdjList graph = new GraphAdjList();

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");

        assertNotNull(graph);
    }

    @Test
    void testAdjMatrixGraphCreation() {
        GraphAdjMatrix graph = new GraphAdjMatrix();

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");

        assertNotNull(graph);
    }

    @Test
    void testAdjListLinearGraph() {
        GraphAdjList graph = new GraphAdjList();

        graph.addEdge("A", "B");
        graph.addEdge("B", "C");
        graph.addEdge("C", "D");

        assertNotNull(graph);
    }

    @Test
    void testAdjMatrixLinearGraph() {
        GraphAdjMatrix graph = new GraphAdjMatrix();

        graph.addEdge("A", "B");
        graph.addEdge("B", "C");
        graph.addEdge("C", "D");

        assertNotNull(graph);
    }

    @Test
    void testAdjListDisconnectedGraph() {
        GraphAdjList graph = new GraphAdjList();

        graph.addEdge("A", "B");
        graph.addEdge("C", "D");

        assertNotNull(graph);
    }

    @Test
    void testAdjMatrixDisconnectedGraph() {
        GraphAdjMatrix graph = new GraphAdjMatrix();

        graph.addEdge("A", "B");
        graph.addEdge("C", "D");

        assertNotNull(graph);
    }

    @Test
    void testAdjListBranchingGraph() {
        GraphAdjList graph = new GraphAdjList();

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("A", "D");

        assertNotNull(graph);
    }

    @Test
    void testAdjMatrixBranchingGraph() {
        GraphAdjMatrix graph = new GraphAdjMatrix();

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("A", "D");

        assertNotNull(graph);
    }
}