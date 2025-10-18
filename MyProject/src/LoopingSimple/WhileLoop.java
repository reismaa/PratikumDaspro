package LoopingSimple;

public class WhileLoop {

    // Method untuk menghitung jumlah bilangan genap dari 1 hingga max
    // Menggunakan perulangan while
    public int getEvenNumbersAndSum(int maxNumber) {
        int sum = 0;
        int i = 1;

        while (i <= maxNumber) {
            if (i % 2 == 0) {
                sum += i; // Menambahkan angka genap ke total sum

            }
            i++; // Menambahkan nilai i untuk melanjutkan ke angka berikutnya

        }

        return sum; // Kembalikan total hasil penjumlahan
    }
    
}
