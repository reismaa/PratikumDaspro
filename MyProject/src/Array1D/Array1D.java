package Array1D;

public class Array1D {

    // Method untuk menampilkan isi array dan total jumlah elemennya
    public String getArrayInfo(int[] arr) {
        // Inisialisasi variable untuk menyimpan hasil output dan total jumlah
        String result = "";
        int sum = 0;

        // Looping untuk menelusuri setiap elemen dalam array
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];

            if (i < arr.length - 1) {
                result += " ";
            }

            sum += arr [i];
        }
        // Menambahkan newline dan hasil jumlah total di akhir output
        result += "\nSum: " + sum;

        // Menambahkan hasil akhir berupa string
        return result;
    }
    
}
