class Person {
    private String name;
    private int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String toString() {
        return "Person[name=" + name + ",birthYear=" + birthYear + "]";
    }
}

class Student extends Person {
    private String major;

    public Student(String name, int birthYear, String major) {
        super(name, birthYear);
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student[super=" + super.toString() + ",major=" + major + "]";
    }
}

class Instructor extends Person {
    private double salary;

    public Instructor(String name, int birthYear, double salary) {
        super(name, birthYear);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Instructor[super=" + super.toString() + ",salary=" + salary + "]";
    }
}

public class PersonTester {
    public static void main(String[] args) {
        Person p1 = new Person("John", 1965);
        Person p2 = new Person("Mary Ann", 1970);
        Student s1 = new Student("Ann", 1982, "Computer Science");
        Student s2 = new Student("Thomas", 1986, "Biology");
        Instructor i1 = new Instructor("Joseph", 1954, 65000.0);

        System.out.println(p1.toString());
        System.out.println("Expected: Person[name=John,birthYear=1965]");
        System.out.println("");

        System.out.println(p2.toString());
        System.out.println("Expected: Person[name=Mary Ann,birthYear=1970]");
        System.out.println("");

        System.out.println(s1.toString());
        System.out.println("Expected: Student[super=Person[name=Ann,birthYear=1982],major=Computer Science]");
        System.out.println("");

        System.out.println(s2.toString());
        System.out.println("Expected: Student[super=Person[name=Thomas,birthYear=1986],major=Biology]");
        System.out.println("");

        System.out.println(i1.toString());
        System.out.println("Expected: Instructor[super=Person[name=Joseph,birthYear=1954],salary=65000.0]");
    }
}
