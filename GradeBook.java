class Student {
    private String name;
    private int rollNumber;
    private int[] marks;

    public Student(String name, int rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int[] getMarks() {
        return marks;
    }


    public double calculateAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }
}

class GraduateStudent extends Student {
    private String thesisTopic;

    public GraduateStudent(String name, int rollNumber, int[] marks, String thesisTopic) {
        super(name, rollNumber, marks);
        this.thesisTopic = thesisTopic;
    }

    public String getThesisTopic() {
        return thesisTopic;
    }

    public void setThesisTopic(String thesisTopic) {
        this.thesisTopic = thesisTopic;
    }

    public void printThesisTitle() {
        System.out.println("Thesis Topic: " + thesisTopic);
    }
}

public class GradeBook {
    public static void main(String[] args) {
        Student s1 = new Student("Hari", 101, new int[]{85, 90, 78});
        System.out.println("Student Name: " + s1.getName());
        System.out.println("Roll Number: " + s1.getRollNumber());
        System.out.println("Average Marks: " + s1.calculateAverage());

        GraduateStudent gs1 = new GraduateStudent("Anita", 202, new int[]{88, 92, 95}, "Machine Learning in Healthcare");
        System.out.println("Graduate Student Name: " + gs1.getName());
        System.out.println("Roll Number: " + gs1.getRollNumber());
        System.out.println("Average Marks: " + gs1.calculateAverage());
        gs1.printThesisTitle();
    }
}
