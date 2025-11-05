package jobsheet9;

import java.util.Scanner;

public class SearchNilai24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyanknya nilai yang akan diinput: ");
        int jumlah = sc.nextInt();

        int[] arrNilai = new int[jumlah];


        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        int hasil = -1; // default -1 artinya belum ditemukan

        // Proses pencarian (Linear Search)
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                break; // hentikan loop jika sudah ketemu
            }
        }

        System.out.println();
        if (hasil != -1) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1));
        } else {
            System.out.println("Nilai " + key + " tidak ditemukan dalam data.");
        }

        sc.close();
    }
    
}
