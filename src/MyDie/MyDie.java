package MyDie;

import java.util.Random;

public class MyDie {

    // Atribut
    private int værdi;


    // Get metode
    public int getVærdi() {
        return værdi;
    }

    // Set metode
    public void setVærdi(int Værdi) {
        this.værdi = Værdi;
    }

    // Roll metode

    public void Myroll () {
        Random r = new Random();
        værdi = r.nextInt(6)+1;
        //System.out.println("k"+værdi);

    }

    // Kontruktor
    public MyDie (){
        Myroll();

    }




}