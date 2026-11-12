package TugasP8;

public class Lingkaran extends BangunDatar {
     private float jari;

    public void setJari(float jari) { 
        this.jari = jari; 
    }
    public float getJari() { 
        return jari; 
    }

   
    protected float luas() { 
        return (float) (Math.PI * jari * jari); 
    }

    protected float keliling() { 
        return (float) (2 * Math.PI * jari); 
    }
    

    public float getLuas() { 
        return luas(); 
    }

    public float getKeliling() {
        float hasilKeliling = keliling();
        System.out.println("2. Lingkaran");
        System.out.println("Jari-jari: " + this.jari);
        System.out.println("Luas     : " + getLuas());
        System.out.println("Keliling : " + hasilKeliling);
        System.out.println("----------------------------------");
        return hasilKeliling;
    }
}
