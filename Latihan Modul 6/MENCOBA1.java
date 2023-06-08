/**
 * Project MENCOBA_MODUL6
 * author Ryuu
 */



import java.util.*;
import java.io.*;

public class MENCOBA1 {
    private int node;
    private LinkedList<Integer> adj[];
    private Queue<Integer> que;

    MENCOBA1(int v) {
        node = v;
        adj = new LinkedList[node];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
        que = new LinkedList<>();
    }

    void insertEdge(int v, int w) {
        adj[v].add(w);
    }

    void BFS(int n) {
        boolean nodes[] = new boolean[node];
        int a = 0;
        nodes[n] = true;
        que.add(n);
        while (!que.isEmpty()) {
            n = que.poll();
            System.out.print(n + " ");
            for (int i = 0; i < adj[n].size(); i++) {
                a = adj[n].get(i);
                if (!nodes[a]) {
                    nodes[a] = true;
                    que.add(a);
                }
            }
        }
    }
}




