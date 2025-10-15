package utsprakdaspro;
import java.util.Scanner;

public class BilanganTerbesar24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b, c;

        System.out.println("=== Menentukan Bilangan Terbesar dari Tiga Angka ===");

        // Validasi Input
        while (true) {
            try {
                System.out.print("Masukkan angka pertama: ");
                a = input.nextDouble();
                System.out.print("Masukkan angka kedua: ");
                b = input.nextDouble();
                System.out.print("Masukkan angka ketiga: ");
                c = input.nextDouble();
                break; // keluar dari loop jika input valid
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid! Harap masukkan angka.");
            }
        }
        double max = Math.max(a, Math.max(b, c));

        System.out.println("\n=== Hasil ===");
        if (a == max && b == max && c == max) {
            System.out.println("Semua angka sama besar: " + a);
        } else if ((a == max && b == max) || (a == max && c == max) || (b == max && c == max)) {
            System.out.print("Ada beberapa angka terbesar yaitu: ");
            if (a == max) System.out.print(a + " ");
            if (b == max) System.out.print(b + " ");
            if (c == max) System.out.print(c + " ");
        } else {
            System.out.println("Angka terbesar adalah: " + max);
        } 

        input.close();
    }
}
