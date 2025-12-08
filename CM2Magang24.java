import java.util.Scanner;

public class CM2Magang24 {

    static String[] nama = new String[100];
    static String[] nim = new String[100];
    static String[] prodi = new String[100];
    static String[] perusahaan = new String[100];
    static int[] semester = new int[100];
    static String[] status = new String[100];
    static int total = 0;

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int pilih;

        do {
            System.out.println("=== Sistem Pendafataran Magang Mahasiswa ===");
            System.out.println("1. Tambah Data Magang");
            System.out.println("2. Tampilkan Semua Pendaftar Magang");
            System.out.println("3. Cari Pendaftar Berdasarkan Program Studi");
            System.out.println("4. Hitung Jumlah Pendaftar untuk Setiap Status");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    tambahData();
                    break;
                case 2:
                    tampilkanData();
                    break;
                case 3:
                    cariProdi();
                    break;
                case 4:
                    hitungStatus();
                    break;
                case 5:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

            System.out.println();

        } while (pilih != 5);
    }

    // 1. Tambah Data
    static void tambahData() {
        System.out.print("Nama Mahasiswa: ");
        nama[total] = input.nextLine();

        System.out.print("NIM: ");
        nim[total] = input.nextLine();

        System.out.print("Program Studi: ");
        prodi[total] = input.nextLine();

        System.out.print("Perusahaan Tujuan Magang: ");
        perusahaan[total] = input.nextLine();

        // validasi semester
        int smt;
        do {
            System.out.print("Semester pengambilan magang (6 atau 7): ");
            smt = input.nextInt();
            if (smt != 6 && smt != 7) {
                System.out.println("Semester hanya boleh 6 atau 7!");
            }
        } while (smt != 6 && smt != 7);
        semester[total] = smt;
        input.nextLine(); 

        // validasi status
        String st;
        do {
            System.out.print("Status magang (Diterima/Menunggu/Ditolak): ");
            st = input.nextLine();
            if (!(st.equalsIgnoreCase("Diterima") ||
                  st.equalsIgnoreCase("Menunggu") ||
                  st.equalsIgnoreCase("Ditolak"))) {
                System.out.println("Status tidak valid!");
            }
        } while (!(st.equalsIgnoreCase("Diterima") ||
                   st.equalsIgnoreCase("Menunggu") ||
                   st.equalsIgnoreCase("Ditolak")));

        status[total] = capitalize(st);

        total++;
        System.out.println("Data pendaftaran magang berhasil ditambahkan. Total pendaftar: " + total);
    }

    // 2. Tampilkan Semua Data
    static void tampilkanData() {
        if (total == 0) {
            System.out.println("Belum ada pendaftar.");
            return;
        }

        System.out.println("----------------------------------------------------------");
        System.out.println("No | Nama\tNIM\t\tProdi\t\tPerusahaan\tSemester\tStatus");
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < total; i++) {
            System.out.printf("%d  | %s\t%s\t%s\t%s\t%d\t\t%s\n", 
                i + 1, nama[i], nim[i], prodi[i], perusahaan[i], semester[i], status[i]);
        }
    }

    // 3. Cari Berdasarkan Program Studi (Tampilan Tabel)
    static void cariProdi() {
        if (total == 0) {
            System.out.println("Belum ada pendaftar.");
            return;
        }

        System.out.print("Masukkan Program Studi: ");
        String cari = input.nextLine();

        boolean found = false;

        System.out.println("----------------------------------------------------------");
        System.out.println("No | Nama\tNIM\t\tProdi\t\tPerusahaan\tSemester\tStatus");
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < total; i++) {
            if (prodi[i].equalsIgnoreCase(cari)) {
                found = true;
                System.out.printf("%d  | %s\t%s\t%s\t%s\t%d\t\t%s\n",
                    i + 1, nama[i], nim[i], prodi[i], perusahaan[i], semester[i], status[i]);
            }
        }

        if (!found) {
            System.out.println("Tidak ada data dengan program studi tersebut.");
        }
    }


    // 4. Hitung Jumlah Status
    static void hitungStatus() {
        if (total == 0) {
            System.out.println("Belum ada pendaftar.");
            return;
        }
        
        int diterima = 0, menunggu = 0, ditolak = 0;
            
        for (int i = 0; i < total; i++) {
            switch ( (status[i].toLowerCase())) {
                case "diterima": diterima++; break;
                case "menunggu": menunggu++; break;
                case "ditolak": ditolak++; break;
            }
        }

        System.out.println("Diterima : " + diterima);
        System.out.println("Menunggu : " + menunggu);
        System.out.println("Ditolak : " + ditolak);
        System.out.println("Total pendaftar: " + total);
    }


    // fungsi bantu : kapitalisasi
    static String capitalize(String s) {
        return s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
    }

}
    

