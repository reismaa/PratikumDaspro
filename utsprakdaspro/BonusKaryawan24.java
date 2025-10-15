package utsprakdaspro;
import java.util.Scanner;

public class BonusKaryawan24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data karyawan
        System.out.print("Masukkan nilai kinerja (1-100): ");
        int kinerja = input.nextInt();

        System.out.print("Masukkan lama bekerja (tahun): ");
        int lamaBekerja = input.nextInt();

        System.out.print("Masukkan gaji pokok (Rp): ");
        double gajiPokok = input.nextDouble();

        System.out.print("Apakah memiliki sertifikasi profesional? (ya/tidak): ");
        String sertifikasi = input.next();

        double bonus = 0;
        double bonusTambahan = 0;

        // Perhitungan bonus berdasarkan kinerja dan lama bekerja
        if (kinerja < 70) {
            bonus = 0;
        } else if (kinerja >= 70 && kinerja < 90) {
            if (lamaBekerja < 2) {
                bonus = 0.01 * gajiPokok;
            } else if (lamaBekerja < 5) {
                bonus = 0.03 * gajiPokok;
            } else {
                bonus = 0.05 * gajiPokok;
            }
        } else if (kinerja >= 90) {
            if (lamaBekerja < 2) {
                bonus = 0.02 * gajiPokok;
            } else if (lamaBekerja < 5) {
                bonus = 0.04 * gajiPokok;
            } else {
                bonus = 0.07 * gajiPokok;
            }
        }

        // Tambahan sertifikasi (jika memenuhi syarat bonus)
        if (bonus > 0 && sertifikasi.equalsIgnoreCase("ya")) {
            bonusTambahan = 500000;
        }

        double totalBonus = bonus + bonusTambahan;

        // Output hasil perhitungan
        System.out.println("\n=== HASIL PERHITUNGAN BONUS ===");
        System.out.println("Nilai Kinerja     : " + kinerja);
        System.out.println("Lama Bekerja      : " + lamaBekerja + " tahun");
        System.out.println("Gaji Pokok        : Rp " + gajiPokok);
        System.out.println("Bonus Kinerja     : Rp " + bonus);
        System.out.println("Bonus Sertifikasi : Rp " + bonusTambahan);
        System.out.println("----------------------------------");
        System.out.println("Total Bonus       : Rp " + totalBonus);

        input.close();
    }
}
