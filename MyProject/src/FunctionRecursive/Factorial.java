package FunctionRecursive;

public class Factorial {

    // method untuk menghitung faktorial dari sebuah bilangan n
    public int factorial(int n) {

        // cek kondisi jika n = 0
        // berdasarkan definisi matematika, 0! (nol faktorial) bernilai 1
        if (n == 0) {
            return 1;
        } else {
            // variabel untuk menyimpan hasil perkalian faktorial
            int result = 1; 

            // perulangan dari 1 hingga n
            for (int i = 1; i <= n; i++) {
                // mengalikan hasil sebelumnya dengan 1
                result *= i;
            }

            // mengembalikan hasil akhir setelah perulangan selesai
            return result;
        }
    }
}
