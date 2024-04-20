import java.util.ArrayList;

public class StudentGroup {
    public String name;
    public ArrayList<Student> studentList = new ArrayList<Student>();

    public StudentGroup(String name, ArrayList<Student> studentList){
        this.name = name;
        this.studentList = studentList;
    }

    public void addingStudentToGroup( Student pajac, StudentGroup Group){
        if (Group.studentList.size() >= 15) throw new IllegalArgumentException("grupa ma już 15 czlonkow");
        Group.studentList.add(pajac);
        System.out.println("Dodano studenta " + pajac.fname +" "+ pajac.lname +" s"+pajac.indexNumber + " do grupy "+ Group.name );
    }
    public void removingStudentFromGroup( Student pajac, StudentGroup Group){
        if (Group.studentList.size() <= 0) throw new IllegalArgumentException("grupa ma 0 czlonkow");
        Group.studentList.remove(pajac);
        System.out.println("Usunieto studenta " + pajac.fname +" "+ pajac.lname +" s"+pajac.indexNumber + " z grupy "+ Group.name );
        System.out.println();
    }
    public void soutStudentList(StudentGroup Group){
        for(Student studencik : Group.studentList){
            System.out.println("Imię : "+studencik.fname + " Nazwisko: "/* + studencik.lname + " NumerIndexu: " + studencik.indexNumber + " e-mail: " + studencik.email
                    + " adres : " + studencik.address + " oceny: "*/); soutStudentGrades(studencik.grades);
        }
    }
    public void soutStudentGrades(ArrayList<Integer> grades){
        for (int grade : grades) {
            System.out.print(grade);
        }
    }
}
