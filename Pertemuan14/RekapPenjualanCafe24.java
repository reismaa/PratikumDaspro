package Pertemuan14;

import java.util.Scanner;

public class RekapPenjualanCafe24 {

    static Scanner input = new Scanner(System.in);

    static String[] menu = {"Kopi", "Teh", "Es Kelapa", "Roti Bakar", "Gorengan"};

    static int[][] penjualan = new int[5][7]; // 5 menu x 7 hari

    // fungsi input data penjualan
    public static void inputData() {
        System.out.println("=== Input Data Penjualan 5 Menu Selama 7 Hari ===");

        for (int i = 0; i < menu.length; i++) {
            System.out.println("Menu: " + menu[i]);
            for (int h = 0; h < 7; h++) {
                System.out.print("  Hari ke-" + (h + 1) + ": ");
                penjualan[i][h] = input.nextInt();
            }
            System.out.println();
        }
    }

    // fungsi menampilkan tabel data penjualan
    public static void tampilTabel() {
        System.out.println("\n=== TABEL PENJUALAN KAFE ===");
        System.out.printf("%-15s", "Menu");
        for (int h = 1; h <= 7; h++) {
            System.out.printf("Hari-%d\t", h);
        }
        System.out.println();

        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%-15s", menu[i]);
            for (int h = 0; h < 7; h++) {
                System.out.printf("%d\t", penjualan[i][h]);
            }
            System.out.println();
        }
    }

    // fungsi mencari menu dengan total penjualan tertinggi
    public static void menuTertinggi() {
        int maxTotal = -1;
        int indexMax = 0;

        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int h = 0; h < 7; h++) {
                total += penjualan[i][h];
            }

            if (total > maxTotal) {
                maxTotal = total;
                indexMax = i;
            }
        }

        System.out.println("\n=== Menu dengan Penjualan Tertinggi ===");
        System.out.println("Menu: " + menu[indexMax]);
        System.out.println("Total Penjualan: " +  maxTotal);
    }
    
    // fungsi menampilkan rata-rata penjualan per menu
    public static void rataRata() {
        System.out.println("\n=== RATA-RATA PENJUALAN SETIAP MENU ===");

        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int h = 0; h < 7; h++) {
                total += penjualan[i][h];
            }
            double rata = total / 7.0;
            System.out.println(menu[i] + ": " + rata);
        }
    }

    // main
    public static void main(String[] args) {

        inputData();
        tampilTabel();
        menuTertinggi();
        rataRata();
    }
}
