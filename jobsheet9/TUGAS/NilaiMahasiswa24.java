package jobsheet9.TUGAS;

import java.util.Scanner;

public class NilaiMahasiswa24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya mahasiswa: ");
        int jumlahMhs = sc.nextInt();

        int[] nilai = new int[jumlahMhs];
        int total = 0;

        // input nilai amhasiswa
        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
            total += nilai[i];
        }

        double rataRata = (double) total / jumlahMhs;

        int tertinggi = nilai[0];
        int terendah = nilai[0];

        // mencari nilai tertinggi dan terendah
        for (int i = 1; i < jumlahMhs; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }

        // menampilkan semua hasil
        System.out.println("\nDaftar Nilai Mahasiswa: ");
        for (int i = 0; i < jumlahMhs; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }

        System.out.println("\nRata-rata nilai: " + rataRata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);

        sc.close();
    }
}
