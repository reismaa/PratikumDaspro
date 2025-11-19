//NAMA : Reisma Devi Apriliandaru
//NIM : 254107060096
//KELAS : SIB-1A
//SOAL KE-3

package KUIS2;

import java.util.Scanner;

public class soal324 {

    // Fungsi konversi nilai → grade huruf
    public static char getGrade(int nilai) {
        if (nilai >= 85 && nilai <= 100) {
            return 'A';
        } else if (nilai >= 70) {
            return 'B';
        } else if (nilai >= 55) {
            return 'C';
        } else if (nilai >= 40) {
            return 'D';
        } else {
            return 'E';
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();

        // 2. Array 2D nilai mahasiswa
        int[][] nilai = new int[n][3];

        // Input nilai
        System.out.println("\nMasukkan nilai mahasiswa (0-100):");
        for (int i = 0; i < n; i++) {
            System.out.println("\nMahasiswa " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                int nilaiInput;
                while (true) {
            System.out.print("  Nilai mata kuliah " + (j + 1) + ": ");
            nilaiInput = sc.nextInt();

            if (nilaiInput >= 0 && nilaiInput <= 100) {
                break; // nilai valid → keluar
            }

            System.out.println("  ERROR: Nilai harus antara 0-100. Silakan coba lagi.");
        }
                nilai[i][j] = sc.nextInt();
            }
        }

        // Hitung rata-rata per mahasiswa
        double[] rataMahasiswa = new double[n];
        for (int i = 0; i < n; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += nilai[i][j];
            }
            rataMahasiswa[i] = total / 3.0;
        }

        // Hitung rata-rata per mata kuliah
        double[] rataMatkul = new double[3];
        for (int j = 0; j < 3; j++) {
            int total = 0;
            for (int i = 0; i < n; i++) {
                total += nilai[i][j];
            }
            rataMatkul[j] = total / (double) n;
        }

        // Cari mata kuliah dengan rata-rata tertinggi
        double maxRata = rataMatkul[0];
        int indexMax = 0;
        for (int j = 1; j < 3; j++) {
            if (rataMatkul[j] > maxRata) {
                maxRata = rataMatkul[j];
                indexMax = j;
            }
        }

        // 5. Tampilkan laporan dengan grade langsung
        System.out.println("\n=============== TABEL NILAI ===============");
        System.out.println("Mhs\tMK1\tG1\tMK2\tG2\tMK3\tG3\tRata-rata");

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + "\t");
            for (int j = 0; j < 3; j++) {
                int nilaiMk = nilai[i][j];
                char grade = getGrade(nilaiMk); // langsung dihitung & ditampilkan
                System.out.print(nilaiMk + "\t" + grade + "\t");
            }
            System.out.printf("%.2f\n", rataMahasiswa[i]);
        }

        // Rata-rata tiap mata kuliah
        System.out.println("\nRata-rata tiap mata kuliah:");
        for (int j = 0; j < 3; j++) {
            System.out.printf("  MK %d : %.2f\n", (j + 1), rataMatkul[j]);
        }

        // Mata kuliah terbaik
        System.out.println("\nMata kuliah dengan rata-rata tertinggi: MK " + (indexMax + 1));

        sc.close();
    }
}
