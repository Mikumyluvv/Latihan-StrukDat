/**
 * Project COBA5
 * author Ryuu
 */



public class Main {
    public static void main(String[] args) {
        Biner biner = new Biner();

        biner.NewNode(20);
        biner.NewNode(2);
        biner.NewNode(25);
        biner.NewNode(37);
        biner.NewNode(16);
        biner.NewNode(70);
        biner.NewNode(11);

//        biner.NewNode(1);
//        biner.NewNode(2);
//        biner.NewNode(3);
//        biner.NewNode(4);
//        biner.NewNode(5);

        System.out.print("\n");
        System.out.println("Data yg diinputkan : 20, 2, 25, 37, 16");

        System.out.print("       20\n" +
                "      /  \\\n" +
                "     2    25\n" +
                "      \\     \\\n" +
                "       16   37");

        System.out.print("\n");
        System.out.print("\n");

        System.out.print("Pre Order : ");
        biner.preOrder(biner.root);
        System.out.print("\n");

        System.out.print("In Order : ");
        biner.inOrder(biner.root);
        System.out.print("\n");

        System.out.print("Post Order : ");
        biner.postOrder(biner.root);
        System.out.print("\n");
    }
}
