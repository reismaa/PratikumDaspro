package jobsheet9;

import java.util.Scanner;

public class ArrayRataNilai24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMhs = sc.nextInt(); // masukkan jumlah elemen array

        int[] nilaiMhs = new int[jumlahMhs]; // deklarasi + instansiasi array
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;
        
        // masukkan nilai ke dalam array
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();

            // Pemisahan nilai lulus dan tidak lulus
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jumlahTidakLulus++;
            }
        }

        // Perhitungan rata-rata nilai lulus dan tidak lulus
        if (jumlahLulus > 0) {
            System.out.println("Rata-rata nilai lulus = " + (totalLulus / jumlahLulus));
        } else {
            System.out.println("Tidak ada mahasiswa yang lulus.");
        }

        if (jumlahTidakLulus > 0) {
            System.out.println("Rata-rata nilai tidak lulus = " + (totalTidakLulus / jumlahTidakLulus));
        } else {
            System.out.println("Semua mahasiswa lulus.");
        }

        sc.close();
    }
    
}
