package ConditionNested;

public class GradeNested {

    // Method untuk menentukan grade berdasarkan subject dan score
    public String getGradeInfo(String subject, int score) {

        String grade; // variabel untuk menyimpan nilai huruf
        String subjectName; // variabel untuk menyimpan nama mata pelajaran yang valid

        // Mengecek nama mata pelajaran terlebih dahulu
        if (subject.equals("Math")) {
            subjectName = "Math";

            // Nested if untuk menentukan grade Math
            if (score >= 90) {
                grade = "A";
            } else if (score >= 75) {
                grade = "B";
            } else if (score >= 60) {
                grade = "C";
            } else {
                grade = "F";
            }

        } else if (subject.equals("English")) {
            subjectName = "English";

            // Nested if untuk menentukan grade English
            if (score >= 85) {
                grade = "A";
            } else if (score >= 70) {
                grade = "B";
            } else if (score >= 55) {
                grade = "C";
            } else {
                grade = "F";
            }

        } else {
            //Jika mata pelajaran tidak dikenali
            subjectName = "Unknown";
            grade = "N/A";
        }

        // Format output sesuai dengan test case
        return "subject: " + subjectName  + ", Grade: " + grade;
        
    }
    
}
