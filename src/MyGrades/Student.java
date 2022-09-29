package MyGrades;

public class Student {


    // Attributter
    private int studienummer;
    private String name;
    private static int newStudieNummer = 1;

    private Karakter grade;


    public Student(String name) {
        studienummer = newStudieNummer += 1;
        setName(name);
    }

    //getter

    public int getStudienummer() {
        return studienummer;
    }
    public String getName() {
        return name;
    }

    //setter

    public void setName(String name) {
        this.name = name;
    }

    //arraylist
    Karakter[] list = {Karakter.A, Karakter.B, Karakter.C, Karakter.D, Karakter.E, Karakter.F, Karakter.G};

    // Add ground AddGrade()
    public void AddGrade(int karakter) {
        System.out.println(list[karakter]);
    }


}
