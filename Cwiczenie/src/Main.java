
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //tworzę studenta s31215
        ArrayList<Integer> gradesS31215= new ArrayList<>();
        gradesS31215.add(3);
        gradesS31215.add(2);
        gradesS31215.add(3);
        Student s31215 = new Student("Jan", "Kowalski", 31215, "s31215", "Szkolna 13",gradesS31215);

        //tworzę studenta s99999
        ArrayList<Integer> gradesS99999= new ArrayList<>();
        gradesS99999.add(5);
        gradesS99999.add(5);
        gradesS99999.add(5);
        Student s99999 = new Student("Franek", "Michalski", 99999, "s99999", "Francuska 20",gradesS99999);

        //tworzę grupe
        ArrayList<Student> gr12StudentList = new ArrayList<>();
        StudentGroup gr12 = new StudentGroup("gr12", gr12StudentList);

        gr12.addingStudentToGroup(s99999 ,gr12);
        gr12.addingStudentToGroup(s31215 ,gr12);

        gr12.soutStudentList(gr12);

        gr12.removingStudentFromGroup(s99999 , gr12);

        gr12.soutStudentList(gr12);

        System.out.println(s31215.getGradesAverage());
    }


}
