package LoopingSimple;

public class ForLoop {

    // Method getNumbersAndSum digunakan untuk menghitung jumlah (sum) dari angka 1 hingga max
    public int getNumbersAndSum(int maxNumber) {
        int sum = 0; // varibel untuk menyimpan hasil penjumlahan

        // Implementasinya menggunakan perulangan for, sesuai dengan instruksi
        // i dimulai dari 1 dan perulangan berhenti ketika i > max
        for (int i = 1; i <= maxNumber; i++) {
            sum += i; // Menambahkan nilai i ke total sum
        }

        // Mengembalikan hasil akhir setelah perulangan selesai
        return sum;
    }
    
}
