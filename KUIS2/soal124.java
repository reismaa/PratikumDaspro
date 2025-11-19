//NAMA : Reisma Devi Apriliandaru
//NIM : 254107060096
//KELAS : SIB-1A
//SOAL KE-1

package KUIS2;

import java.util.Scanner;

public class soal124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Meminta input jumlah elemen array
        System.out.print("Masukkan jumlah elemen array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        //Membaca n bilangan bulat dan menyimpannya ke array
        System.out.println("Masukkan " + n + " bilangan bulat:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //Menghitung jumlah bilangan genap dan ganjil
        int bilGenap = 0, bilGanjil = 0;

        //Menyimpang bilangan genap dan ganjil ke array terpisah
        String genapList = "";
        String ganjilList = "";

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                bilGenap++;
                genapList += arr[i] + " ";
            } else {
                bilGanjil++;
                ganjilList += arr[i] + " ";
            }
        }

        //Menampilkan daftar bilangan genap dan ganjil secara terpisah
        System.out.println("\nJumlah bilangan genap : " + bilGenap);
        System.out.println("Jumlah bilangan ganjil : " + bilGanjil);

        System.out.println("\nDaftar bilangan genap : " + genapList);
        System.out.println("Daftar bilangan ganjil : " + ganjilList);

        sc.close();
        
    }
    
}
