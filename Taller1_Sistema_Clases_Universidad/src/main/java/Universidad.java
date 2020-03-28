import java.util.List;

public class Universidad {

    List<Teacher> teachers;
    List<Student> students;
    List<Class> classes;

    public Universidad(List<Teacher> teachers, List<Student> students, List<Class> classes) {
        this.teachers = teachers;
        this.students = students;
        this.classes = classes;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Class> getClasses() {
        return classes;
    }

    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }



}
