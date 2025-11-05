package jobsheet9.TUGAS;

import java.util.Scanner;

public class SearchMenuKafe24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"
        }; 

        System.out.println("=== Daftar Menu Kafe ===");
        for (String item : menu) {
            System.out.println("- " + item);
        }

        System.out.print("\nMasukkan nama makanan yang ingin dicari: ");
        String cari = sc.nextLine();

        boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                System.out.println(menu[i] + " tersedia di menu ke-" + i + ".");
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println( cari + " tidak ada di menu.");
        }

        sc.close();
    }
    
}
