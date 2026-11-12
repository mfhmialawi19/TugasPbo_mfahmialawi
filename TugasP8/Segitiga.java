package TugasP8;

public class Segitiga extends BangunDatar {
     private float alas;
    private float tinggi;
    private float sisiB; 
    private float sisiC; 

    public void setAlas(float alas) { 
        this.alas = alas; 
    }
    public float getAlas() { 
        return alas; 
    }

    public void setTinggi(float tinggi) { 
        this.tinggi = tinggi; 
    }
    public float getTinggi() { 
        return tinggi; 
    }

    public void setSisiB(float sisiB) { 
        this.sisiB = sisiB; 
    }
    public float getSisiB() { 
        return sisiB; 
    }

    public void setSisiC(float sisiC) { 
        this.sisiC = sisiC; 
    }
    public float getSisiC() { 
        return sisiC; 
    }

   
    protected float luas() { 
        return 0.5f * alas * tinggi; 
    }

    
    protected float keliling() { 
        return alas + sisiB + sisiC; 
    }

   
    public float getLuas() { 
        return luas(); 
    }

  
    public float getKeliling() {
        float hasilKeliling = keliling();
        System.out.println("4. Segitiga");
        System.out.println("Alas     : " + this.alas);
        System.out.println("Tinggi   : " + this.tinggi);
        System.out.println("Luas     : " + getLuas());
        System.out.println("Keliling : " + hasilKeliling);
        System.out.println("----------------------------------");
        return hasilKeliling;
    }
}
