import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class Class {
    String name;
    String classroom;
    List<Student> students;
    Teacher teacher;

    public Class(String name, String classroom, Teacher teacher, List<Student> students){
        this.name = name;
        this.classroom = classroom;
        this.teacher = teacher;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Class{" +
                "name='" + name + '\'' + "\n" +
                ", classroom='" + classroom + '\'' + "\n" +
                ", students=" +  students.toString() + "\n" +
                ", teacher=" + teacher +
                '}';
    }
}
