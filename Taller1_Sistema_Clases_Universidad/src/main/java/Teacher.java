abstract class Teacher {

    protected String name;
    protected double salary;

    public abstract double finalSalary();

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' + "\n" +
                ", salary=" + salary +
                '}';
    }
}
