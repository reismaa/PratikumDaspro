package jobsheet9.TUGAS;

import java.util.Scanner;

public class PemesananKafe24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        String[] namaPesanan = new String[jumlah];
        double[] hargaPesanan = new double[jumlah];
        double totalBiaya = 0;

        // input nama dan harga pesanan
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nama pesanan ke-" + (i + 1) + ": ");
            namaPesanan[i] = sc.nextLine();

            System.out.print("Masukkan harga " + namaPesanan[i] + ": Rp ");
            hargaPesanan[i] = sc.nextDouble();
            sc.nextLine();

            totalBiaya += hargaPesanan[i];
        }

        // menampilkan daftar pesanan
        System.out.println("\n===== Daftar Pesanan =====");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp " + hargaPesanan[i]);
        }

        System.out.println("=========================");
        System.out.println("Total Biaya: Rp " + totalBiaya);

        sc.close();
    }
    
}
