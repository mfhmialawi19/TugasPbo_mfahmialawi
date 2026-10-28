package Tugas1;

import java.util.Scanner;

public class TugasB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=====================================");
        System.out.println("Program - 1 (Luas Persegi Panjang)");
        float panjang = 2;
        float lebar = 5;
        float luas = panjang * lebar;
        System.out.println("Panjang : " + panjang + " | Lebar : " + lebar);
        System.out.println("Luas    : " + luas);
        
 
        System.out.println("\n=====================================");
        System.out.println("Program - 2 (Lingkaran)");
        double jari;
        System.out.print("Masukkan jari-jari : ");
        jari = input.nextDouble();
        double PI = 3.14;
        
        double luas1 = PI * (jari * jari);
        double keliling = 2 * PI * jari;
        
        System.out.println("Luas     : " + luas1);
        System.out.println("Keliling : " + keliling);
        
        System.out.println("\n=====================================");
        System.out.println("Program - 3 (Konversi Waktu ke Detik)");
        int jam, menit, detik, totdet;
        System.out.print("Masukkan jam    : ");
        jam = input.nextInt();
        System.out.print("Masukkan menit  : ");
        menit = input.nextInt();
        System.out.print("Masukkan detik  : ");
        detik = input.nextInt();
        
        totdet = (jam * 3600) + (menit * 60) + detik;
        
        System.out.println("Total Detik : " + totdet + " detik");
        System.out.println("=====================================");
        
        input.close();
    }    
}