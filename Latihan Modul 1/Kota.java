/**
 * Project coba
 * author Ryuu
 */
public class Kota<E> {
    private E element;

    public Kota(E kota){
        element = kota;
    }

    public E getElement(){
        return element;
    }

    public static void main(String[] args) {
        Kota<Integer> jumlahkota = new Kota<>(9);
        Kota<String> namakota = new Kota<String>("Malang");
        System.out.println("Jumlah kota dijawa timur :" +jumlahkota.element+" kota");
        System.out.println("Salah satu kota dijawa timur adalah kota "+namakota.getElement());
    }
}

