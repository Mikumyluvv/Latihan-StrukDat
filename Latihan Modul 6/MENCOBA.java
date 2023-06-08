import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Project MENCOBA_MODUL6
 * author Ryuu
 */

public class MENCOBA {
    private LinkedList<Integer> []adj;
    private boolean visited[];

    MENCOBA(int V){

        adj = new LinkedList[V];
        visited = new boolean[V];

        for (int i = 0; i < V; i++){
            adj[i] = new LinkedList<Integer>();
        }

    }

    void InsertEdge(int src, int dest){

        adj[src].add(dest);

    }

    void DFS(int vertex){

        visited[vertex] = true;
        System.out.println(vertex +"");

        Iterator<Integer> it = adj[vertex].listIterator();

        while (it.hasNext()){
            int n = it.next();
            if (!visited[n]){
                DFS(n);
            }
        }
    }



}


//
//public class MENCOBA {
//    private LinkedList<Integer>[] adj;
//    private boolean[] visited;
//
//    MENCOBA(int V) {
//        adj = new LinkedList[V];
//        visited = new boolean[V];
//
//        for (int i = 0; i < V; i++) {
//            adj[i] = new LinkedList<>();
//        }
//    }
//
//    void InsertEdge(int src, int dest) {
//        adj[src].add(dest);
//    }
//
//    void DFS(int vertex) {
//        visited[vertex] = true;
//        System.out.print(vertex + " ");
//
//        Iterator<Integer> it = adj[vertex].listIterator();
//
//        while (it.hasNext()) {
//            int n = it.next();
//            if (!visited[n]) {
//                DFS(n);
//            }
//        }
//    }
//}

