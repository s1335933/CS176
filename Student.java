public class Student {
    private String name;
    private int birthYear;
    private String major;

    // Constructor
    public Student(String name, int birthYear, String major) {
        this.name = name;
        this.birthYear = birthYear;
        this.major = major;
    }

    /**
     * Returns the string representation of the object.
     * @return a string representation of the object
     */
    @Override
    public String toString() {
        return "Student[name=" + name + ", birthYear=" + birthYear + ", major=" + major + "]";
    }
}
