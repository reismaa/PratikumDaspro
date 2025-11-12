package jobsheet10;

import java.util.Scanner;

public class TugasJobsheet10_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] nilai = new int[10][6];
        int i, j;
        double total, rata;

        // ======== 1. INPUT DATA SURVEI ========
        System.out.println("=== INPUT NILAI SURVEI ===");
        for (i = 0; i < 10; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (j = 0; j < 6; j++) {
                System.out.print("  Pertanyaan ke-" + (j + 1) + ": ");
                nilai[i][j] = input.nextInt();
            }
        }

        // ======== 2. RATA-RATA PER RESPONDEN ========
        System.out.println("\n=== RATA-RATA SETIAP RESPONDEN ===");
        for (i = 0; i < 10; i++) {
            total = 0;
            for (j = 0; j < 6; j++) {
                total += nilai[i][j];
            }
            rata = total / 6;
            System.out.println("Responden ke-" + (i + 1) + ": " + rata);
        }

        // ======== 3. RATA-RATA PER PERTANYAAN ========
        System.out.println("\n=== RATA-RATA SETIAP PERTANYAAN ===");
        for (j = 0; j < 6; j++) {
            total = 0;
            for (i = 0; i < 10; i++) {
                total += nilai[i][j];
            }
            rata = total / 10;
            System.out.println("Pertanyaan ke-" + (j + 1) + ": " + rata);
        }

        // ======== 4. RATA-RATA KESELURUHAN ========
        total = 0;
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 6; j++) {
                total += nilai[i][j];
            }
        }
        rata = total / (10.0 * 6.0);
        System.out.println("\n=== RATA-RATA KESELURUHAN ===");
        System.out.println("Rata-rata keseluruhan nilai survei: " + rata);

        input.close();
    }
}
