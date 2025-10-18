package LoopingNested;

public class ForLoopNested {
    
    // Method untuk membuat pola grid baris dan kolom
    // Menggunakan nested for loop
    public String getGrid(int max) {
        String result = "";

        for (int i = 1; i <= max; i++) {
            for (int j = 1; j <= max; j++) {
                result += "Row " + i + " Col " + j;
                if (i != max || j != max) {
                    result += "\n"; // tambahkan newline kecuali di akhir
                }
            }
        }

        return result;
    }
}
