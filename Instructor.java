public class Instructor {
    private String name;
    private int birthYear;
    private double salary;

    public Instructor(String name, int birthYear, double salary) {
        this.name = name;
        this.birthYear = birthYear;
        this.salary = salary;
    }

 
    public String toString() {
        return "Instructor[name=" + name + ", birthYear=" + birthYear + ", salary=" + salary + "]";
    }
}
