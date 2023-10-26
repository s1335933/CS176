public class Person {
    private String name;
    private int birthYear;

    // Constructor
    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    /**
     * Returns the string representation of the object.
     * @return a string representation of the object
     */
    @Override
    public String toString() {
        return "Person[name=" + name + ", birthYear=" + birthYear + "]";
    }
}
