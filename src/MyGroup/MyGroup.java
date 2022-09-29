package MyGroup;

public class MyGroup {


    // Atributter
    private String name;
    private int number;
    private String email;

    private Køn køn;



    // kontruktor

    public MyGroup (String name, int number, String email, Køn køn ) {
        setName(name);
        setNumber(number);
        setEmail(email);
        setKøn(køn);


    }


    // get metode

    private String getName(){
        return name;
    }

    private int getNumber (){
        return number;
    }

    private String getEmail() {
        return email;
    }

    private Køn getKøn(){
        return køn;
    }


   //  set metode

    private void setName(String name){
        this.name = name;
    }

    private void setNumber(int number){
        this.number = number;
    }


    private void setEmail(String email){
        this.email = email;
    }

    public void setKøn(Køn køn){
        this.køn = køn;

    }

    public String toString(){
        return "" + getName() + " " +getNumber() + " " + getEmail() + " " +  getKøn();
    }


}
