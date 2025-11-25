package posttestbasic;

public class ScoreAnalyzer {

    public String classifyResult(int[] scores) {

        if (scores == null || scores.length == 0) {
            return "Poor"; // fallback agar tidak error
        }
        
        int total = 0;
        int count = scores.length;

        for (int score : scores) {
            // hanya tambahkan nilai yang valid (0-100)
            if (score >= 0 && score <= 100) {
                total += score;
            }
        }

        // sesuai test case: pembagian menggunakan jumlah elemen asli bukan jumlah elemen valid
        double average = (double) total / count;

        // menentukan katergori berdasarkan rata-rata
        if (average >= 85) {
            return "Excellent";
        } else if (average >= 70) {
            return "Good";
        } else if (average >= 50) {
            return "Fair";
        } else {
            return "Poor";
        }


    }

}


