package tugas_2;

import java.util.Scanner;

class Sepeda{
    private Scanner input = new Scanner(System.in);
    String nama;
    int jarak_tempuh = 0;
    
    public void inputNama(){
        System.out.print("Masukan nama sepeda : ");
        nama = input.nextLine();
 
        System.out.println("Object" + nama + "Dibuat,Jarak tempuh awal" + jarak_tempuh + "KM");
    }
    public void maju(){
        jarak_tempuh += 10;
        System.out.println("Bergerak maju sejauh 10 KM");
    }
    public void mundur(){
        jarak_tempuh -= 5;
        System.out.println("Bergerak mundur sejauh 5 KM");
    }
    public void berhenti(){
        System.out.println("Sepeda " + nama + " Jarak tempuh " + jarak_tempuh + " KM");
    }
    public void tampil_menu(){
        System.out.println("1.Maju");
        System.out.println("2.Mundur");
        System.out.println("3.Berhenti");
        System.out.println("4.Keluar");
        System.out.print("Pilihan  : ");
    }
    public void jalankanSepeda(){
        inputNama();
        int pilihan;
        do{
            tampil_menu();
            pilihan = input.nextInt();
            
            if(pilihan == 1){
                maju();
            }else if(pilihan == 2){
                mundur();
            }else if(pilihan == 3){
                berhenti();
            }else if(pilihan != 4){
                System.out.println("Pilihan tidak ada");
            }
        }while(pilihan != 4);
    }
}
public class Tugas_2 {
        public static void main(String[] args) {
            
            Sepeda sepeda1 = new Sepeda();
            sepeda1.jalankanSepeda();
    }
    
}
