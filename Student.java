public class Student extends Person { // Assuming that Person is the superclass for Student
    private String major;

    // Constructor
    public Student(String name, int birthYear, String major) {
        super(name, birthYear); // Call the constructor of the superclass (Person)
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student[name=" + getName() + ", birthYear=" + getBirthYear() + ", major=" + major + "]";
    }
}
