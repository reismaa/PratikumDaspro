package Identifier; // Disesuaikan dengan nama package

public class StudentInfo {

    // name (String): nama mahasiswa
    // age (int): umur mahasiswa
    // GPA (double): nilai IPK mahasiswa
    public String showStudentInfo(String name, int age, double GPA) {
        // Format string sesuai dengan yang diharapkan oleh test case
        // Perhatikan spasi setelah "Age :" dan "GPA :"
        // Serta setiap baris diakhiri dengan "\n"
        String result = "Name: " + name + "\n" +
                        "Age : " + age + "\n" +
                        "GPA : " + GPA + "\n";

        return result; // Mengembalikan hasil format string
    }
}
