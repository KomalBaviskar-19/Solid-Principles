class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class StudentPrinter {
    public void printDetails(Student student) {
        System.out.println("Student Name: " + student.getName());
    }
}

public class SRPExample {
    public static void main(String[] args) {
        Student student = new Student("Komal Baviskar");
        StudentPrinter printer = new StudentPrinter();
        printer.printDetails(student);
    }
}
