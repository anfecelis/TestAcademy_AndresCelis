public class FullTimeTeacher extends Teacher {

    private int experience;

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public FullTimeTeacher(String name, double salary, int experience){
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }

    public double finalSalary() {
        return salary * (experience * 1.1);
    }

}
