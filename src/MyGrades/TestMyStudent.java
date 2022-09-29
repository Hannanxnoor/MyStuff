package MyGrades;

public class TestMyStudent {

    void run(){
        Student s1 = new Student("Uggi");
        Student s2 = new Student("Lee");
        Student s3 = new Student("Keeekee");

        System.out.println("------------------------------");
        System.out.println("The student information site");
        System.out.println("------------------------------");
        System.out.println("Student name:" + s1.getName() + '\n' + "Student ID:" + "   "+ s1.getStudienummer());
        System.out.println("Grade");
        s1.AddGrade(4);
        System.out.println("Student name:" + s2.getName() + '\n' + "Student ID:" + "   "+ s2.getStudienummer());
        System.out.println("Grade");
        s1.AddGrade(2);
        System.out.println("Student name:" + s3.getName() + '\n' + "Student ID:" + "   "+ s3.getStudienummer());
        System.out.println("Grade");
        s1.AddGrade(0);



    }


    public static void main(String[] args) {
        new TestMyStudent().run();
    }
}
