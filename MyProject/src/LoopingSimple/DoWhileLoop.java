package LoopingSimple;

public class DoWhileLoop {

    // Method untuk menghitung jumlah bilangan ganjil dari 1 hingga maxNumber
    // Menggunakan perulangan di-while
    public int getOddNumbersAndSum(int maxNumber) {
        int sum = 0;
        int i = 1;

        if (maxNumber <= 0) {
            return 0; // Jika input 0 atau negatif, langsung return 0

        }

        do { 
            if ( i % 2 != 0) {
                sum += i; // Tambahkan hanya bilangan ganjil
            }
            i++;
        } while (i <= maxNumber);

        return sum;
    }
    
}
