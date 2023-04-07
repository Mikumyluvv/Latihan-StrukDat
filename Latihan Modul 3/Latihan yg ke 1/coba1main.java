/**
 * Project LATIHAN PRAK
 * author Ryuu
 */
public class coba1main {
    public static void main(String[] args) {
        coba1 s = new coba1(5);


        s.push("satu");
        s.push("dua");
        s.push("tiga");

        System.out.println("Next : " + s.peek());
        s.push("empat");
        System.out.println(s.pop());
        s.push("lima");

        int count = s.search("satu");

        while (count != -1 && count > 1) {
            s.pop();
            count--;
        }
        System.out.println(s.pop());
        System.out.println(s.empty());
    }
}
