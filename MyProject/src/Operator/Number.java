package Operator;

public class Number {

    // Method untuk menampilkan hasil berbagai operasi antara dua bilangan
    public String getOperatorResults(int a, int b) {

        // Operasi aritmatika: penjumlahan
        	int sum = a + b;

        	// Operasi aritmatika: perkalian
        	int product = a * b;

        	// Operasi pembanding: apakah a sama dengan b?
        	boolean isEqual = (a == b);

        	// Operasi logika AND: true jika a > 0 dan b > 0
        	boolean logicalAnd = (a > 0 && b > 0);

        	// Operasi logika OR: true jika a < 0 atau b > 0
        	boolean logicalOr = (a < 0 || b > 0);

        	// Format string hasil output
        	//   Perhatikan bahwa 4 baris pertama diakhiri dengan "\n",
        	//   sedangkan baris terakhir (Logical OR) tidak menggunakan "\n"
        	String result = "Sum: " + sum + "\n" +
                        		"Product: " + product + "\n" +
                        		"Is Equal: " + isEqual + "\n" +
                        		"Logical AND: " + logicalAnd + "\n" +
                       			"Logical OR: " + logicalOr;

        	// Mengembalikan hasil akhir
        	return result;
    }
}

