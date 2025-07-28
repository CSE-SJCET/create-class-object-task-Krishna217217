public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("krishna", 46, 'A');
        student1.displayDetails();
    }
}

class Student {
    String name;
    int rollNumber;
    char grade;

    
    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }
}
