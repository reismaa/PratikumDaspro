package Pertemuan14;

import java.util.Scanner;

public class NilaiMahasiswa24 {

    // a. fungsi isianArray
    public static void isianArray(int[] nilai) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        input.close();
    }

    // b. fungsi tampilArray
    public static void tampilArray(int[] nilai) {
        System.out.println("\n== Daftar Nilai Mahasiswa ==");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Mahasiswa " + (i + 1) + ": " + nilai[i]);
        }
    }

    // c. fungsi hitTot
    public static int hitTot(int[] nilai) {
        int total = 0;
        for (int n : nilai) {
            total += n;
        }
        return total;
    }

    // d. fungsi main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int N = input.nextInt();

        // membuat array dengan ukuran N
        int[] nilaiMahasiswa = new int[N];

        // memanggil fungsi-fungsi
        isianArray(nilaiMahasiswa);
        tampilArray(nilaiMahasiswa);

        int totalNilai = hitTot(nilaiMahasiswa);

        System.out.println("\nTotal nilai seluruh mahasiswa: " + totalNilai);

        input.close();
    }
}
