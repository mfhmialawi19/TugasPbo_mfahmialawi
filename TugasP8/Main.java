package TugasP8;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PERHITUNGAN BANGUN DATAR TUGAS PERTEMUAN 8 ===\n");
        
        Persegi persegi = new Persegi();
        persegi.setSisi(5);
        persegi.getKeliling(); 

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setJari(7);
        lingkaran.getKeliling(); 

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.setPanjang(10);
        persegiPanjang.setLebar(4);
        persegiPanjang.getKeliling(); 

        Segitiga segitiga = new Segitiga();
        segitiga.setAlas(6);
        segitiga.setTinggi(8);
        segitiga.setSisiB(5); 
        segitiga.setSisiC(5); 
        segitiga.getKeliling();
    }
}
