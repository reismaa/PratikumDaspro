package jobsheet5;
import java.util.Scanner;

public class SistemPerpustakaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Sistem Izin Masuk Perpustakaan ---");
        System.out.print("Apakah membawa kartu mahasiswa? (true/false): ");
        boolean punyaKTM = sc.nextBoolean();

        System.out.print("Apakah sudah registrasi online? (true/false): ");
        boolean registrasiOnline = sc.nextBoolean();

        if (punyaKTM || registrasiOnline) {
            System.out.println("Izin masuk diberikan.");
        } else {
            System.out.println("Izin masuk ditolak.");
        }

        sc.close();
    }
    
}
