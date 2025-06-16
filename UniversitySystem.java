class Person {
    private String name;
    private String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getRoleDetails() {
        return "Name: " + name + "\nID: " + id;
    }
}

class Student extends Person {
    private String program;

    public Student(String name, String id, String program) {
        super(name, id);
        this.program = program;
    }

    public String getProgram() {
        return program;
    }

    @Override
    public String getRoleDetails() {
        return super.getRoleDetails() + "\nProgram: " + program;
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, String id, String subject) {
        super(name, id);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String getRoleDetails() {
        return super.getRoleDetails() + "\nSubject: " + subject;
    }
}
class Admin extends Person {
    private String department;

    public Admin(String name, String id, String department) {
        super(name, id);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String getRoleDetails() {
        return super.getRoleDetails() + "\nDepartment: " + department;
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
    
        Student student = new Student("Ram", "102", "Computer Science");
        Teacher teacher = new Teacher("Sanukaji", "502", "Mathematics");
        Admin admin = new Admin("sita", "632", "Finance");

        Person[] people = {student, teacher, admin};

        for (Person p : people) {
            System.out.println("Person Details ");
            System.out.println(p.getRoleDetails());
            System.out.println();
        }
    }
}

