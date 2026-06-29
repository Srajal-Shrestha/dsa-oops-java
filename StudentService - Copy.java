import java.util.ArrayList;
import java.util.Scanner;

class StudentService {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    public void start() {
        int choice;

        do {
            System.out.println("\n--- Student Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Choose: ");

            choice = input.nextInt();
            input.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    addStudent();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 3);
    }

    private void addStudent() {
        System.out.print("Enter name: ");
        String name = input.nextLine();

        System.out.print("Enter age: ");
        int age = input.nextInt();
        input.nextLine();

        System.out.print("Enter grade: ");
        String grade = input.nextLine();

        Student s = new Student(name, age, grade);
        students.add(s);

        System.out.println("Student added!");
    }

    private void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student s : students) {
            System.out.println("\n--- Student ---");
            s.display();
        }
    }
}