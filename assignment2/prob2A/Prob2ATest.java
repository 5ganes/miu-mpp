package MPP.assignment2.prob2A;

class Student{
    private String name;
    GradeReport gReport;
    Student(String name){
        this.name = name;
        gReport = new GradeReport(this, "A");
    }

    @Override
    public String toString(){
        return "Name of Student = " + this.name + " and Grade : " + gReport.getGrade();
    }
}

class GradeReport{
    private String grade;
    private Student owner;
    GradeReport(Student student, String grade) {
        this.grade = grade;
        owner = student;
    }

    public String getGrade(){
        return grade;
    }
}

public class Prob2ATest {
    public static void main(String[] args) {
        Student s1 = new Student("John");
        System.out.println(s1);
    }
}
