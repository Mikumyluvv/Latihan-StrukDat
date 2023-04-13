/**
 * Project tesss
 * author Ryuu
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Coba4 {
    private HashMap<String, String> tabelData;
    private HashMap<String, String> tabelSesiLogin;

    public Coba4() {
        tabelData = new HashMap<String, String>();
        tabelSesiLogin = new HashMap<String, String>();
    }

    public boolean tambahData(String nimPraktikan, String namaAsisten) {
        if (nimPraktikan.contains("IF") && !tabelData.containsKey(nimPraktikan)) {
            tabelData.put(nimPraktikan, namaAsisten);
            return true;
        }
        return false;
    }

    public void tampil() {
        for (Map.Entry<String, String> entry : tabelData.entrySet()) {
            System.out.println("NIM: " + entry.getKey() + " | Nama Asisten: " + entry.getValue());
        }
    }

    public void listNimPraktikan() {
        for (String nimPraktikan : tabelData.keySet()) {
            System.out.println(nimPraktikan);
        }
    }

    public void listNamaAsisten() {
        for (String namaAsisten : tabelData.values()) {
            System.out.println(namaAsisten);
        }
    }

    public int totalEmail() {
        return tabelData.size();
    }

    public boolean hapusData(String nimPraktikan, String namaAsisten) {
        if (tabelData.containsKey(nimPraktikan) && tabelData.get(nimPraktikan).equals(namaAsisten)) {
            tabelData.remove(nimPraktikan);
            return true;
        }
        return false;
    }

    public boolean editData(String nimPraktikan, String namaAsisten) {
        if (tabelData.containsKey(nimPraktikan)) {
            tabelData.put(nimPraktikan, namaAsisten);
            System.out.println("Data berhasil diubah!");
        } else {
            System.out.println("Data tidak ditemukan!");
        }
        return false;
    }

    public boolean login() {
        Scanner input = new Scanner(System.in);
        System.out.print("Email: ");
        String email = input.nextLine();
        System.out.print("Password: ");
        String password = input.nextLine();

        if (tabelSesiLogin.containsKey(email) && tabelSesiLogin.get(email).equals(password)) {
            if (email.endsWith("@umm.ac.id")) {
                System.out.println("Login berhasil!");
                System.out.println("Daftar fitur/metode:");
                System.out.println("1. Tambah data praktikan");
                System.out.println("2. Tampilkan semua data");
                System.out.println("3. Tampilkan daftar NIM praktikan");
                System.out.println("4. Tampilkan daftar nama asisten");
                System.out.println("5. Total email yang terdaftar");
                System.out.println("6. Hapus data praktikan");
                System.out.println("7. Edit data praktikan");
                System.out.println("8. Logout");
            } else {
                System.out.println("Gagal Login: email bukan dari domain UMM");
            }
        } else {
            System.out.println("Gagal Login: email atau password salah");
        }
        return false;
    }

    public void logout() {
        System.out.println("Anda berhasil logout!");
    }

}
