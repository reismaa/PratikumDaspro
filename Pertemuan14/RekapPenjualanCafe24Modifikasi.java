package Pertemuan14;

import java.util.Scanner;

public class RekapPenjualanCafe24Modifikasi {

    static Scanner input = new Scanner(System.in);

    static String[] menu;
    static int[][] penjualan;

    // Input jumlah menu dan hari, lalu input penjualan
    public static void inputData() {

        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = input.nextInt();
        input.nextLine(); // buang enter

        System.out.print("Masukkan jumlah hari penjualan: ");
        int jumlahHari = input.nextInt();
        input.nextLine();

        menu = new String[jumlahMenu];
        penjualan = new int[jumlahMenu][jumlahHari];

        System.out.println("\n=== Input Nama Menu ===");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Menu " + (i + 1) + ": ");
            menu[i] = input.nextLine();
        }

        System.out.println("\n=== Input Data Penjualan ===");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.println("Menu: " + menu[i]);
            for (int h = 0; h < jumlahHari; h++) {
                System.out.print("  Hari ke-" + (h + 1) + ": ");
                penjualan[i][h] = input.nextInt();
            }
            System.out.println();
        }
    }

    // Menampilkan tabel penjualan
    public static void tampilTabel() {
        int hari = penjualan[0].length;

        System.out.println("\n=== TABEL PENJUALAN ===");
        System.out.printf("%-15s", "Menu");
        for (int h = 1; h <= hari; h++) {
            System.out.printf("Hari-%d\t", h);
        }
        System.out.println();

        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%-15s", menu[i]);
            for (int h = 0; h < hari; h++) {
                System.out.printf("%d\t", penjualan[i][h]);
            }
            System.out.println();
        }
    }

    // Menu tertinggi
    public static void menuTertinggi() {
        int hari = penjualan[0].length;

        int maxTotal = -1;
        int indexMax = 0;

        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int h = 0; h < hari; h++) {
                total += penjualan[i][h];
            }

            if (total > maxTotal) {
                maxTotal = total;
                indexMax = i;
            }
        }

        System.out.println("\n=== Menu dengan Penjualan Tertinggi ===");
        System.out.println("Menu: " + menu[indexMax]);
        System.out.println("Total Penjualan: " + maxTotal);
    }

    // Rata-rata tiap menu
    public static void rataRata() {
        int hari = penjualan[0].length;

        System.out.println("\n=== RATA-RATA PENJUALAN ===");
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int h = 0; h < hari; h++) {
                total += penjualan[i][h];
            }
            double rata = (double) total / hari;
            System.out.println(menu[i] + ": " + rata);
        }
    }

    // MAIN
    public static void main(String[] args) {
        inputData();
        tampilTabel();
        menuTertinggi();
        rataRata();
    }
}
