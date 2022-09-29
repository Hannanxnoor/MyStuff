package MyGroup;

public class TestMyGroup {
    void run(){


        MyGroup gp1 = new MyGroup("Ahlam", 758429034, "K1@gmail.com", Køn.KVINDE);
        MyGroup gp2 = new MyGroup("Aylaa", 36741927, "F2@gmail.com",Køn.KVINDE);
        MyGroup gp3 = new MyGroup("Lee", 48239038, "L6@gmail.com", Køn.MAND);

        System.out.println(gp1.toString() + gp2.toString() + gp3.toString()) ;
        System.out.println();











    }

    public static void main(String[] args) {
        new TestMyGroup().run();


    }}
