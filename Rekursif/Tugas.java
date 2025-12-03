package Rekursif;

import java.util.Scanner;

public class Tugas {


    static int totalRekursif(int[] data, int n) {
        if (n == 0) {
            return data[0];
        } else {
            return data[n] + totalRekursif(data, n - 1);
        }
    }

    static int totalIteratif(int[] data) {
        int total = 0;
        for (int i = 0; i < data.length; i++) {
            total += data[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int n = sc.nextInt();

        int[] angka = new int[n];


        for (int i = n; i >= 1; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            angka[i - 1] = sc.nextInt();
        }

        int hasilRekursif = totalRekursif(angka, n - 1);

        int hasilIteratif = totalIteratif(angka);

        System.out.println("Total dari " + n + " angka yang dimasukkan adalah: " + hasilIteratif);
    
        sc.close();
    }
}

