/**
 * Created by Hyunjung on 2018. 1. 12..
 */
public class ManageStudent {
    public static void main(String [] args) {
        Student [] student = null;
        ManageStudent manager = new ManageStudent();
        student = manager.addStudent();
        manager.printStudent(student);
    }

    public Student[] addStudent() {
        Student[] student = new Student[3];
        student[0] = new Student("Lim");
        student[1] = new Student("Min");
        student[2] = new Student("Sook", "Seoul", "01000000000", "ask@godofjava.com");
        return student;
    }

    public Student[] printStudent(Student[] student) {
        int length = student.length;
        for (int i=0; i<length; i++) {
            System.out.println(student[i]);
        }
        return student;
    }

    public void checkEquals() {
        Student a = new Student("Min", "Seoul", "010xxxxxxxx", "ask@godofjava.com");
        Student b = new Student("Min", "Seoul", "010xxxxxxxx", "ask@godofjava.com");


    }
}
