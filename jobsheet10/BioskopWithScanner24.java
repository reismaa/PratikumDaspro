package jobsheet10;

import java.util.Scanner;

public class BioskopWithScanner24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] penonton = new String[4][2];
        int pilihan;

        do {
            System.out.println("\n===== MENU BIOSKOP =====");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // membersihkan buffer

            switch (pilihan) {
                case 1:
                    // Input data penonton
                    while (true) {
                        System.out.print("Masukkan nama: ");
                        String nama = sc.nextLine();

                        int baris, kolom;
                        while (true) {
                            System.out.print("Masukkan baris (1-4): ");
                            baris = sc.nextInt();
                            System.out.print("Masukkan kolom (1-2): ");
                            kolom = sc.nextInt();
                            sc.nextLine();

                            // Cek validasi posisi kursi
                            if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                                System.out.println("Nomor baris/kolom tidak tersedia! Coba lagi.");
                            } else if (penonton[baris-1][kolom-1] != null) {
                                System.out.println("Kursi sudah terisi! Pilih kursi lain.");
                            } else {
                                // Jika valid, simpan nama
                                penonton[baris-1][kolom-1] = nama;
                                break;
                            }
                        }

                        System.out.print("Input penonton lainnya? (y/n): ");
                        String next = sc.nextLine();
                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;

                case 2:
                    // Tampilkan daftar penonton
                    System.out.println("\n===== DAFTAR PENONTON =====");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            String kursi = (penonton[i][j] == null) ? "***" : penonton[i][j];
                            System.out.print(kursi + "\t");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi!");
            }
        } while (pilihan != 3);

        sc.close();
    }
}
