package Array2D;

public class Array2D {

        // Method untuk menampilkan informasi matrix 2D
    public String getMatrixInfo(int[][] arr) {
        String result = "";
        int total = 0; // menyimpan jumlah semua elemen
        int count = 0; // menghitung jumlah elemen untuk rata-rata

        // Loop baris
        for (int i = 0; i < arr.length; i++) {
            result += "Row " + (i + 1) + ": ";

        // Loop kolom
        for (int j = 0; j < arr.length; j++) {
            int value = arr[i][j];
            total += value; // menambahkan ke total
            count++; // menambahkan jumlah elemen

            // Menambahkan label E (genap) atau O (ganjil)
            if (value % 2 == 0) {
                result += value + "E ";
            } else {
                result += value + "O ";
            }
        }

        // menambahkan newline setelah setiap baris
        result += "\n";
    }

    // Menghitung rata-rata
    double average = (double) total / count;

    // Menambahkan hasil total dan rata-rata
    result += "Total: " + total + "\n";
    result += "Average: " + average;

    // Mengembalikan hasil akhir
    return result;

    }
}