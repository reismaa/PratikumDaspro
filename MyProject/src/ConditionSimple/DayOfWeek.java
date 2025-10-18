package ConditionSimple;

public class DayOfWeek {

    // Method untuk mengembalikan nama hari berdasarkan nomor hari
    public String getDayName(int dayNumber) {

        String dayName; // Variabel untuk menyimpan nama hari

        // Menggunakan switch-case sesuai dengan instruksi test case
        switch (dayNumber) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            // Jika dayNumber tidak cocok dengan 1–7
            default:
                dayName = "Unknown";
                break;
        }

        // Format output sesuai dengan test case
        return "Day: " + dayName;
    }
}
