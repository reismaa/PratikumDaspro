package jobsheet5;
import java.util.Scanner;

public class WiFiKampus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Sistem Akses WiFi Kampus ---");
        System.out.print("Jenis pengguna (dosen/mahasiswa/lain): ");
        String jenis = sc.next().toLowerCase();

        if (jenis.equals("dosen")) {
            System.out.println("Akses WiFi diberikan (dosen).");
        } else if (jenis.equals("mahasiswa")) {
            System.out.println("Masukkan jumlah SKS yang diambil: ");
            int sks = sc.nextInt();

            if (sks >= 12) {
                System.out.println("Akses WiFi diberikan (mahasiswa aktif).");
            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12.");
            }
        } else {
            System.out.println("Akses ditolak.");
        }
        sc.close();
    }
}
