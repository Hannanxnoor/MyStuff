package MyCard;

public class MyCard {

    private Farve farven;

 private int Værdi;


    public Farve getFarve() {
        return farven;
    }

    public int getVærdi() {
        return Værdi;
    }

    public MyCard ( int Værdi, Farve farven){
        this.farven = farven;
        this.Værdi = Værdi;


    }


    @Override
    public String toString() {
        return getFarve() + "   " + getVærdi();
    }
}
