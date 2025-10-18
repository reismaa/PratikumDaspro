package ConditionSimple;

public class Grade {

    // Method untuk menentukan nilai huruf berdasarkan skor
    public String getGrade(int score) {

        // Gunakan if-else sesuai instruksi di komentar test case
        String result;

        // Jika nilai >= 90, maka Grade A
        if (score >= 90) {
            result = "Grade: A";
        }
        // Jika nilai >= 75 dan < 90, maka Grade B
        else if (score >= 75) {
            result = "Grade: B";
        }
        // Jika nilai >= 60 dan < 75, maka Grade C
        else if (score >= 60) {
            result = "Grade: C";
        }
        // Jika nilai < 60, maka Grade F
        else {
            result = "Grade: F";
        }

        // Mengembalikan hasil dalam format "Grade"
        return result;
    }
}
