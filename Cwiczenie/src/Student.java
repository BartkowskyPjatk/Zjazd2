import java.util.ArrayList;

public class Student {
    public String fname, lname, email, address;
    public int indexNumber;
    public ArrayList<Integer> grades = new ArrayList<Integer>();

    public Student(String fname, String lname, int indexNumber, String email, String address, ArrayList<Integer> grades){
        this.fname = fname;
        this.lname = lname;
        this.indexNumber = indexNumber;
        this.email = email;
        this.address = address;
        this.grades = grades;
    }
    public Student(String fname, String lname, int indexNumber, String email, String address){
        this.fname = fname;
        this.lname = lname;
        this.indexNumber = indexNumber;
        this.email = email;
        this.address = address;
    }

    public double getGradesAverage(){
        if (grades.size() == 0) throw new IllegalArgumentException("brak ocen");
        if (grades.size()>20) throw new IllegalArgumentException("Student ma więcej niż 20 ocen");

        double sumGrades =0;
        for ( double grade : grades){
            sumGrades += grade;
        }
        return sumGrades/grades.size();
    }
}

