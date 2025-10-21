import java.util.Scanner;

public class CM1_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Input Data Mahasiswa
        System.out.println("==== INPUT DATA MAHASISWA ====");
        System.out.print("Nama : ");
        String nama = input.nextLine();
        System.out.print("NIM  : ");
        String nim = input.nextLine();

        //Input nilai untuk mata kuliah 1: Algoritma dan Pemrograman
        System.out.println("\n---- Mata Kuliah 1: Algoritma dan Pemrograman ----");
        double utsAlgo = inputNilai(input, "Nilai UTS");
        double uasAlgo = inputNilai(input, "Nilai UAS");
        double tugasAlgo = inputNilai(input, "Nilai Tugas");

        //Input nilai untuk mata kuliah 2: Struktur Data
        System.out.println("\n---- Mata Kuliah 2: Struktur Data ----");
        double utsSD = inputNilai(input, "Nilai UTS");
        double uasSD = inputNilai(input, "Nilai UAS");
        double tugasSD = inputNilai(input, "Nilai Tugas");

        //Proses Perhitungan Nilai Akhir
        //Menghitung nilai akhir setiap mata kuliah dengan bobot : UTS 30%, UAS 40%, Tugas 30%
        double akhirAlgo = (utsAlgo * 0.3) + (uasAlgo * 0.4) + (tugasAlgo * 0.3);
        double akhirSD = (utsSD * 0.3) + (uasSD * 0.4) + (tugasSD * 0.3);
        double rataRata = (akhirAlgo + akhirSD) / 2;

        //Konversi Nilai ke Huruf
        String hurufAlgo = konversiNilaiHuruf(akhirAlgo);
        String hurufSd = konversiNilaiHuruf(akhirSD);

        //Menentukan Status Kelulusan per Mata Kuliah
        String statusAlgo, statusSD;

        //Struktur if untuk menentukan lulus/tidak
        if (akhirAlgo >= 60) {
            statusAlgo = "LULUS";
        } else {
            statusAlgo = "TIDAK LULUS";
        }

        if (akhirSD >= 60) {
            statusSD = "LULUS";
        } else {
            statusSD = "TIDAK LULUS";
        }

        //Status Kelulusan Semester (Nested If)
        String statusSemester;
        if (statusAlgo.equals("LULUS") && statusSD.equals("LULUS")) {
            if (rataRata >= 70) {
                statusSemester = "LULUS (Rata-rata >= 70)";
            } else {
                statusSemester = "TIDAK LULUS (Rata-rata < 70)";
            }
        } else {
            statusSemester = "TIDAK LULUS (Salah Satu MK Tidak Lulus)";
        }
        
        //Output Hasil Penilaian
        System.out.println("\n========== HASIL PENILAIAN AKADEMIK ==========");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println();
        System.out.println("Mata Kuliah\t\t\tUTS\tUAS\tTugas\tNilai Akhir\tNiai Huruf\tStatus");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Algoritma Pemrograman\t\t" + utsAlgo + "\t" + uasAlgo + "\t" + tugasAlgo + "\t" + akhirAlgo +  "\t\t" + hurufAlgo + "\t\t" + statusAlgo);
        System.out.println("Struktur Data\t\t\t" + utsSD + "\t" + uasSD + "\t" + tugasSD + "\t" + akhirSD +  "\t\t" + hurufSd + "\t\t" + statusSD);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Rata-rata Nilai Akhir: " + rataRata);
        System.out.println("Status Semester      : " + statusSemester);


        input.close();
    }

    //Fungsi validasi input nilai
    public static double inputNilai(Scanner input, String keterangan) {
        double nilai;
        while (true) {
            System.out.print(keterangan + " : ");
            nilai = input.nextDouble();
            if (nilai >= 0 && nilai <= 100) {
                break;
            } else {
                System.out.println("Nilai harus berada di antara 0 - 100! Silahkan input ulang.");
            }
        }
        return nilai;
    }

    //Method untuk konversi nilai ke huruf
    public static String konversiNilaiHuruf(double nilai) {
        if (nilai >= 85) return "A";
        else if (nilai >= 80) return "A-";
        else if (nilai >= 75) return "B+";
        else if (nilai >= 70) return "B";
        else if (nilai >= 65) return "C+";
        else if (nilai >= 60) return "C";
        else if (nilai >= 55) return "D";
        else return "E";
            
        }
}
