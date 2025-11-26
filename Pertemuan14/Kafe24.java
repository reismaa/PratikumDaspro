package Pertemuan14;

import java.util.Scanner;

public class Kafe24 {

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan +  "!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        // Promo tambahan
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Kode promo valid! Anda mendapatkan diskon 50%.");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Kode promo valid! Anda mendapatkan dsikon 30%.");
        } else {
            System.out.println("Kode promo invalid.");
        }

        System.out.println("===== MENU RESTO KAFE ===");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("0. Selesai Memesan");
        System.out.println("===========================");
    }

    // fungsi hitung total harga (dengan promo)
    public static int hitungTotalHarga24(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        if (pilihanMenu < 1 || pilihanMenu > hargaItems.length) {
            System.out.println("Nomor menu tidak valid!");
            return 0;
        }

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        int diskon = 0;

        if (kodePromo != null) {
            if (kodePromo.equalsIgnoreCase("DISKON50")) {
                diskon = hargaTotal / 2;
                System.out.println("Diskon 50% diterapkan: -Rp" + diskon);
            } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
                diskon = (int)(hargaTotal * 0.3);
                System.out.println("Diskon 30% diterapkan: -Rp" + diskon);
            } else {
                System.out.println("Kode promo invalid. Tidak ada diskon.");
            }
        }

        return hargaTotal - diskon;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu("Budi", true, "DISKON30");

        int totalKeseluruhan = 0;

        while (true) {
            System.out.print("\nMasukkan nomor menu (0 untuk selesai): ");
            int pilihanMenu = sc.nextInt();

            if (pilihanMenu == 0) {
                break;
            }

            System.out.print("Masukkan jumlah item: ");
            int banyakItem = sc.nextInt();

            int totalHargaMenu = hitungTotalHarga24(pilihanMenu, banyakItem, "DISKON30");
            System.out.println("Total harga menu ini: Rp" + totalHargaMenu);

            totalKeseluruhan += totalHargaMenu;
        }

        System.out.println("\n===== TOTAL PEMBELIAN =====");
        System.out.println("Total keseluruhan pesanan Anda: Rp" + totalKeseluruhan);
        System.out.println("============================");

        sc.close();
    }
}
