//NAMA : Reisma Devi Apriliandaru
//NIM : 254107060096
//KELAS : SIB-1A
//SOAL KE-2

package KUIS2;

import java.util.Scanner;

public class soal224 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Deklarasi array 2D nilai[4][3]
        int[][] nilai = new int[4][3];

        //Input nilai untuk setiap siswa dan matkul
        System.out.println("Masukkan nilai ujian 4 siswa (3 mata pelajaran):");
        for (int i = 0; i < 4; i++) {
            System.out.println("\nSiswa " + (i + 1) + ": ");
            for (int j = 0; j < 3; j++) {
                System.out.println("Nilai mata pelajaran " + (j + 1) + ":");
                nilai[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n===== LAPORAN NILAI =====");

        //Menghitung rata-rata dan status setiap siswa
        for (int i = 0; i < 4; i++) {
            int total = 0;

            //Menghitung total nilai 3 matkul
            for (int j = 0; j < 3; j++) {
                total += nilai[i][j];
            } 

            double rata = total / 3.0;

            String status;
            if (rata >= 60) {
                status = "Lulus";
            } else {
                status = "Tidak Lulus";
            }

            //Menampilkan laporan
            System.out.printf("Siswa %d: rata-rata = %.2f, status = %s\n", (i + 1), rata, status);
        }

        sc.close();

    }
    
}
