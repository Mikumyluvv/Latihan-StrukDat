/**
 * Project LATIHAN PRAK
 * author Ryuu
 */
public class coba2main {
    public void queue(){
        coba2 q = new coba2(5);
        q.enqueue("satu");
        q.enqueue("dua");

        ;
        q.enqueue("empat");

        System.out.println("remove : " + q.dequeue());
        System.out.println("element : " + q.peek());
        System.out.println("poll : " + q.dequeue());
        System.out.println("peek : " + q.peek());
    }

    public static void main(String[] args) {
        new LATIHAN_2().queue();
    }
}
