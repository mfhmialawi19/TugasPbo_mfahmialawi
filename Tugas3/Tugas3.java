package Tugas3;

import java.util.Scanner;

class BangunDatar {
    public void luas(){
        System.out.println("Luas bangun datar = luas");
    }
    public void keliling(){
        System.out.println("Keliling bangun datar = keliling");
        System.out.println("=====================================");
    }
}

class Persegi extends BangunDatar{
    Scanner sc = new Scanner(System.in);
    int sisi;
    
    public void luas(){
        System.out.println("\n--- PERSEGI ---");
        System.out.print("Masukkan sisi : ");
        sisi = sc.nextInt();
        int hasil = sisi * sisi;
        System.out.println("Hasil luas : " + hasil);
    }
    public void keliling(){
        int hasil = sisi * 4;
        System.out.println("Hasil keliling : " + hasil);
        System.out.println("=====================================");
    }   
}

class PersegiPanjang extends BangunDatar{
    Scanner sc = new Scanner(System.in);
    int panjang;
    int lebar;
            
    public void luas(){
        System.out.println("\n--- PERSEGI PANJANG ---");
        System.out.print("Input panjang : ");
        panjang = sc.nextInt();
        System.out.print("Input lebar : ");
        lebar = sc.nextInt();
        
        int hasil = panjang * lebar;
        System.out.println("Hasil luas : " + hasil);
    }
    public void keliling(){
        int hasil = 2 * (panjang + lebar);
        System.out.println("Hasil keliling : " + hasil);
        System.out.println("=====================================");
    }
}

class Lingkaran extends BangunDatar{
    Scanner sc = new Scanner(System.in);
    double r;
    
    public void luas(){
        System.out.println("\n--- LINGKARAN ---");
        System.out.print("Masukkan jari-jari : ");
        r = sc.nextDouble();
        double hasil = 3.14 * (r * r);
        System.out.println("Hasil luas : " + hasil);
    }
    public void keliling(){
        double hasil = 2 * 3.14 * r;
        System.out.println("Hasil keliling : " + hasil);
        System.out.println("=====================================");
    }
}

class Segitiga extends BangunDatar{
    Scanner sc = new Scanner(System.in);
    double alas;
    double tinggi;
            
    public void luas(){
        System.out.println("\n--- SEGITIGA SAMA KAKI/SEMBARANG ---");
        System.out.print("Input alas : ");
        alas = sc.nextDouble();
        System.out.print("Input tinggi : ");
        tinggi = sc.nextDouble();
        
      
        double hasil = 0.5 * alas * tinggi;
        System.out.println("Hasil luas : " + hasil);
    }
    public void keliling(){
      
        System.out.print("Input sisi miring/lainnya untuk keliling (atau 3 * alas): ");
        double kelilingSisi = sc.nextDouble();
        double hasil = alas + (2 * kelilingSisi); 
        System.out.println("Hasil keliling : " + hasil);
        System.out.println("=====================================");
    }
}

public class Tugas3 {
    public static void main(String[] args) {
       BangunDatar b1 = new BangunDatar();
       b1.luas();
       b1.keliling();
       
       Persegi p1 = new Persegi();
       p1.luas();
       p1.keliling();
       
       Lingkaran l1 = new Lingkaran();
       l1.luas();
       l1.keliling();
       
       PersegiPanjang pp = new PersegiPanjang();
       pp.luas();
       pp.keliling();
       
       Segitiga s1 = new Segitiga();
       s1.luas();
       s1.keliling();
    }
}