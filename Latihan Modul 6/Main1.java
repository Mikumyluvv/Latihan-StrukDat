/**
 * Project MENCOBA_MODUL6
 * author Ryuu
 */



    public class Main1 {
    public static void main(String[] args) {
        MENCOBA1 graph = new MENCOBA1(6);
        graph.insertEdge(0, 1);
        graph.insertEdge(0, 3);
        graph.insertEdge(0, 4);
        graph.insertEdge(4, 5);
        graph.insertEdge(3, 5);
        graph.insertEdge(1, 2);
        graph.insertEdge(1, 0);
        graph.insertEdge(2, 1);
        graph.insertEdge(4, 1);
        graph.insertEdge(3, 1);
        graph.insertEdge(5, 4);
        graph.insertEdge(5, 3);
        System.out.print("Breadth First Traversal for the graph is: ");
        graph.BFS(0);

    }

}

