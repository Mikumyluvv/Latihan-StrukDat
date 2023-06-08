/**
 * Project MENCOBA_MODUL6
 * author Ryuu
 */
public class Main {
    public static void main(String[] args) {
        MENCOBA grap = new MENCOBA(8);

        grap.InsertEdge(0,1);
        grap.InsertEdge(0,2);
        grap.InsertEdge(0,3);
        grap.InsertEdge(1,3);
        grap.InsertEdge(2,4);
        grap.InsertEdge(3,5);
        grap.InsertEdge(3,6);
        grap.InsertEdge(4,7);
        grap.InsertEdge(4,5);
        grap.InsertEdge(5,2);

        System.out.print("DEPTH FIRST TRAVERSAL FOR THE GRAPH IS : ");
        grap.DFS(0);


    }
}
