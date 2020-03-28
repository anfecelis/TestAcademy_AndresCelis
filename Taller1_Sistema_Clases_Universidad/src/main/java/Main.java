import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        //Initializing Teachers: Full Time y Part Time
        Teacher teacherFullTime1 = new FullTimeTeacher("Gloria Barreto", 1000000, 8);
        Teacher teacherFullTime2 = new FullTimeTeacher("Edison Acevedo", 2000000, 5);
        //Initializing Teachers: Part Time
        Teacher teacherPartTime1 = new PartTimeTeacher("Ivan Carrión", 1000000, 12);
        Teacher teacherPartTime2 = new PartTimeTeacher("Edith Duarte", 1000000, 6);

        //Initializing Students
        Student student1 = new Student("Julián Parra", "1018437412", 23);
        Student student2 = new Student("Andrea Gómez", "1018437413", 25);
        Student student3 = new Student("Edgar Carrión", "1018437414", 23);
        Student student4 = new Student("Ricardo Espinel", "1018437415", 22);
        Student student5 = new Student("Paula Santander", "1018437416", 24);
        Student student6 = new Student("Cristian Orjuela", "1018437417", 25);

        //Initializing Teacher Lists
        List<Teacher> teachersAll = new ArrayList<>();
        teachersAll.add(teacherFullTime1);
        teachersAll.add(teacherFullTime2);
        teachersAll.add(teacherPartTime1);
        teachersAll.add(teacherPartTime2);

        //Student List 1
        List<Student> studentList1 = new ArrayList<>();
        studentList1.add(student1);
        studentList1.add(student2);
        studentList1.add(student3);
        //Student List 2
        List<Student> studentList2 = new ArrayList<>();
        studentList1.add(student4);
        studentList1.add(student5);
        studentList1.add(student6);
        //Student List 3
        List<Student> studentList3 = new ArrayList<>();
        studentList1.add(student1);
        studentList1.add(student3);
        studentList1.add(student5);
        //Student List 4
        List<Student> studentList4 = new ArrayList<>();
        studentList1.add(student2);
        studentList1.add(student4);
        studentList1.add(student6);
        //Student List All Students
        List<Student> studentAll = new ArrayList<>();
        studentList1.add(student1);
        studentList1.add(student2);
        studentList1.add(student3);
        studentList1.add(student4);
        studentList1.add(student5);
        studentList1.add(student6);

        //Initializing Classes
        Class class1 = new Class("Physics - Mechanics","303", teacherFullTime1, studentList1);
        Class class2 = new Class("Differential Calculus","503", teacherPartTime1, studentList2);
        Class class3 = new Class("Linear Algebra","202", teacherFullTime2, studentList3);
        Class class4 = new Class("Ethics","106", teacherPartTime2, studentList4);

        //Class List
        List<Class> classesAll = new ArrayList<>();
        classesAll.add(class1);
        classesAll.add(class2);
        classesAll.add(class3);
        classesAll.add(class4);

        //Adding the new student to the Student List
        Universidad universidad1 = new Universidad(teachersAll, studentAll, classesAll);

        //Print all the Professors with its data
        System.out.println(teachersAll);
        System.out.println(studentAll);

        //Submenu for selecting a class

        System.out.println("Enter 1 for select " + class1.name);
        System.out.println("Enter 2 for select " + class2.name);
        System.out.println("Enter 3 for select " + class3.name);
        System.out.println("Enter 4 for select " + class4.name);
        String chooseClass = (new Scanner(System.in).nextLine());

        //Print all the Classes
        if (chooseClass.equals("1")){
            System.out.println(class1);
        } else if(chooseClass.equals("2")){
            System.out.println(class2);
        } else if(chooseClass.equals("3")) {
            System.out.println(class3);
        } else if(chooseClass.equals("4")) {
            System.out.println(class4);
        }

        System.exit(0);
        //Creating a new student

        //System.out.println("Enter a new Student name");
        //String studentName = (new Scanner(System.in)).nextLine();; //Create a scanner object
        //System.out.println("The new student name is: " + studentName);

        //List<Class> newStudent = new ArrayList<>();
        //newStudent.add(studentName);
        }
    }

