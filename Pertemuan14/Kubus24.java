package Pertemuan14;

import java.util.Scanner;

public class Kubus24 {

    // fungsi menghitung volume kubus
    static double hitungVolume(double sisi) {
        return sisi * sisi * sisi; // volume = s³
    }

    // fungsi menghitung luas permukaan kubus
    static double hitungLuasPermukaan(double sisi) {
        return 6 * sisi * sisi; // luas permukaan = 6 x s²
    }

    // fungsi main untuk mengetes fungsi
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = input.nextDouble();

        double volume = hitungVolume(sisi);
        double luasPermukaan = hitungLuasPermukaan(sisi);

        System.out.println("\n===== HASIL PERHITUNGAN KUBUS =====");
        System.out.println("Sisi kubus = " + sisi);
        System.out.println("Volume kubus = " + volume);
        System.out.println("Luas permukaan kubus = " + luasPermukaan);

        input.close();
    }
    
}
