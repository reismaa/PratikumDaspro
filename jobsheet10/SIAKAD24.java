package jobsheet10;

import java.util.Scanner;

public class SIAKAD24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Meminta jumlah siswa dan mata kuliah
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = sc.nextInt();

        // Deklarasi array dengan ukuran dinamis
        int[][] nilai = new int[jumlahSiswa][jumlahMatkul];

        // Input nilai dan hitung rata-rata per siswa
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("\nInput nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;

            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            double rataPerSiswa = totalPerSiswa / jumlahMatkul;
            System.out.println("Rata-rata mahasiswa ke-" + (i + 1) + ": " + rataPerSiswa);
        }

        // Menghitung rata-rata setiap mata kuliah
        System.out.println("\n====================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah:");

        for (int j = 0; j < jumlahMatkul; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < jumlahSiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }

            double rataPerMatkul = totalPerMatkul / jumlahSiswa;
            System.out.println("Mata Kuliah " + (j + 1) + ": " + rataPerMatkul);
        }

        sc.close();
    }
}
