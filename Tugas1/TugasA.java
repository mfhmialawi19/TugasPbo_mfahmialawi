package Tugas1;

import java.util.Scanner;

public class TugasA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int xx = 1;
        
        do {
            int pilihan;
            System.out.println("\n=====================================");
            System.out.println("Pilihan Menu :");
            System.out.println("1. Input Tahun");
            System.out.println("2. Keluar");
            System.out.print("Masukkan Pilihan : ");
            pilihan = input.nextByte();
            
            if (pilihan == 1) {
                int tahun;
                System.out.print("Masukkan tahun (1909 - 2024) : ");
                tahun = input.nextInt();
                
              
                if (tahun < 1909 || tahun > 2024) {
                    System.out.println("Peringatan: Tahun di luar rentang 1909 - 2024!");
                } else {
                    
                    boolean isKabisat = (tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0);
                    
                    if (isKabisat) {
                        System.out.println(tahun + " adalah tahun kabisat.");
                    } else {
                        System.out.println(tahun + " bukan tahun kabisat.");
                    }
                }
                
            } else if (pilihan == 2) {
                System.out.println("Program selesai. Terima kasih!");
                xx = 2;
            } else {
                System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
            
        } while (xx == 1);
        
        input.close();
    }
}
