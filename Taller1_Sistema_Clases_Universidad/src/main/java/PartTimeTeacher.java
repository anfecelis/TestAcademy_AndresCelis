public class PartTimeTeacher extends Teacher {

    private int hours;

    public PartTimeTeacher(String name, double salary, int hours){
        this.name = name;
        this.salary = salary;
        this.hours = hours;
    }
    public double finalSalary() {
        return salary * hours;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
