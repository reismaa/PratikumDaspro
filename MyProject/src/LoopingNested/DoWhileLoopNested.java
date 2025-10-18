package LoopingNested;

public class DoWhileLoopNested {

    // Method untuk membentuk segitiga angka menggunakan nested do-while loop
    public String getNumberTriangle(int maxNumber) {
        String result = "";
        int i = 1;

        do {
            int j = 1;
            do {
                result += j;
                j++;
            } while (j <= i);

            if (i < maxNumber) {
                result += "\n"; // tambahkan baris baru kecuali baris terakhir
            }

            i++;
        } while (i <= maxNumber);

        return result;
    }
    
}
