/**
 * Project tesss
 * author Ryuu
 */
import java.util.Scanner;

public class MainCoba4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Coba4 Coba4 = new Coba4();

        while (true) {
            System.out.println("\n=== Aplikasi Data Praktikan ===");
            System.out.println("1. Tambah data praktikan");
            System.out.println("2. Tampilkan data praktikan");
            System.out.println("3. Tampilkan list NIM praktikan");
            System.out.println("4. Tampilkan list nama asisten");
            System.out.println("5. Total data berhasil diinputkan");
            System.out.println("6. Hapus data praktikan");
            System.out.println("7. Edit data praktikan");
            System.out.println("8. Login");
            System.out.println("9. Keluar");
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan NIM praktikan (dengan format IFXXXX): ");
                    String nim = scanner.nextLine();
                    System.out.print("Masukkan nama asisten: ");
                    String namaAsisten = scanner.nextLine();
                    if (Coba4.tambahData(nim, namaAsisten)) {
                        System.out.println("Data berhasil ditambahkan");
                    } else {
                        System.out.println("NIM praktikan sudah terdaftar");
                    }
                    break;
                case 2:
                    Coba4.tampil();
                    break;
                case 3:
                    Coba4.listNimPraktikan();
                    break;
                case 4:
                    Coba4.listNamaAsisten();
                    break;
                case 5:
                    System.out.println("Total data berhasil diinputkan: " + Coba4.totalEmail());
                    break;
                case 6:
                    System.out.print("Masukkan NIM praktikan yang ingin dihapus: ");
                    nim = scanner.nextLine();
                    System.out.print("Masukkan nama asisten yang ingin dihapus: ");
                    namaAsisten = scanner.nextLine();
                    if (Coba4.hapusData(nim, namaAsisten)) {
                        System.out.println("Data berhasil dihapus");
                    } else {
                        System.out.println("Data tidak ditemukan");
                    }
                    break;
                case 7:
                    System.out.print("Masukkan NIM praktikan yang ingin diedit: ");
                    nim = scanner.nextLine();
                    System.out.print("Masukkan nama asisten yang ingin diedit: ");
                    namaAsisten = scanner.nextLine();
                    if (Coba4.editData(nim, namaAsisten)) {
                        System.out.println("Data berhasil diedit");
                    } else {
                        System.out.println("Data tidak ditemukan");
                    }
                    break;
                case 8:
                    System.out.print("Masukkan email: ");
                    String email = scanner.nextLine();
                    System.out.print("Masukkan password: ");
                    String password = scanner.nextLine();
                    if (Coba4.login()) {
                        System.out.println("\n=== Fitur Aplikasi Data Praktikan ===");
                        System.out.println("1. Tambah data praktikan");
                        System.out.println("2. Tampilkan data praktikan");
                        System.out.println("3. Tampilkan list NIM praktikan");
                        System.out.println("4. Tampilkan list nama asisten");
                        System.out.println("5. Total data berhasil diinputkan");
                    }
            }
        }
    }
}
