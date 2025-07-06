// import java.util.Date;
// import java.sql.Date;
package pack.college;
import pack.college.student.MyStudent;
import pack.college.student.studentdetails.StudentDetails;
import pack.college.teacher.MyTeacher;
import pack.college.teacher.teacherdetails.TeacherDetails;

class MyMain{
    public static void main(String[] args) {
        // java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("I am  Main");
        // java.util.Date d1;
        // java.util.Date d2;

        MyStudent ms = new MyStudent();
        ms.print();

        MyTeacher mt = new MyTeacher();
        mt.print();

        StudentDetails sd = new StudentDetails();
        sd.print();

        TeacherDetails td = new TeacherDetails();
        td.print();
    }
}