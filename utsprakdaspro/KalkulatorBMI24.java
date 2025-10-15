package utsprakdaspro;
import java.util.Scanner;

public class KalkulatorBMI24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double berat, tinggi, bmi;

        System.out.println("=== Kalkulator BMI (Body Mass Index) ===");

        // Validasi Input Berat Badan
        while (true) {
            try {
                System.out.print("Masukkan berat badan (kg): ");
                berat = input.nextDouble();
                if (berat <= 0) {
                    System.out.println("Berat badan harus lebih dari 0!");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid! Harap masukkan angka.");
            }
        }

        // Validasi input tinggi badan
        while (true) {
            try {
                System.out.print("Masukkan tinggi badan (meter): ");
                tinggi = input.nextDouble();
                if (tinggi <= 0) {
                    System.out.println("Tinggi badan harus lebih dari 0!");
                    continue;
                } 
                break;
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid! Harap masukkan angka.");
            }
        }

        // Hitung BMI 
        bmi = berat / (tinggi * tinggi);

        // Tentukan kategori dan risiko kesehatan
        String kategori, risiko;
        if (bmi < 18.5) {
            kategori = "Kurang berat badan (Underweight)";
            risiko = "Kekurangan gizi, osteoporosis, penurunan sistem kekebalan tubuh.";
        } else if (bmi < 25) {
            kategori = "Berat badan normal (Normal weight)";
            risiko = "Risiko kesehatan relatif rendah.";
        } else if (bmi < 30) {
            kategori = "Kelebihan berat badan (Overweight)";
            risiko = "Meningkatnya risiko penyakit jantung, diabetes, dan tekanan darah tinggi.";
        } else {
            kategori = "Obesitas (Obese)";
            risiko = "Risiko tinggi penyakit jantung, diabetes, tekanan darah tinggi, masalah pernapasan, dan beberapa jenis kanker.";
        }

        // Tampilkan hasil
        System.out.println("\n=== Hasil Perhitungan BMI ===");
        System.out.printf("Nilai BMI       : " + bmi);
        System.out.println("\nKategori        : " + kategori);
        System.out.println("Risiko Kesehatan: " + risiko);

        input.close();
    }
}
