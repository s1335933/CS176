public class Instructor {
    private String name;
    private int birthYear;
    private double salary;

    // Constructor
    public Instructor(String name, int birthYear, double salary) {
        this.name = name;
        this.birthYear = birthYear;
        this.salary = salary;
    }

    /**
     * Returns the string representation of the object.
     * @return a string representation of the object
     */
    @Override
    public String toString() {
        return "Instructor[name=" + name + ", birthYear=" + birthYear + ", salary=" + salary + "]";
    }
}
