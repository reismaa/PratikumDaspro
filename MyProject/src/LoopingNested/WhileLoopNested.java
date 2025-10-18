package LoopingNested;

public class WhileLoopNested {

    // Method untuk membentuk pola segitiga menggunakan nested while loop
    public String getTriangle(int maxNumber) {
        String result = "";
        int i = 1;

        while (i <= maxNumber) {
            int j = 1;
            while (j <= i) {
                result += "*";
                j++;
            }
            if (i < maxNumber) {
                result += "\n"; // Tambah baris baru kecuali di baris terakhir 
            }
            i++;
        }

        return result;
    }
    
}
