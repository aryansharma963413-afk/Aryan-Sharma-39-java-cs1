import java.util.Scanner;

public class Student {

    String[] courses = new String[5];
    int courseCount = 0;

    void registerCourse(String courseName) {

        if (courseCount < 5) {
            courses[courseCount] = courseName;
            courseCount++;

            System.out.println("Course registered successfully.");
        } else {
            System.out.println("You cannot register for more than 5 courses.");
        }
    }

    void displayCourses() {

        System.out.println("\n----- Registered Courses -----");

        if (courseCount == 0) {
            System.out.println("No courses registered.");
        } else {
            for (int i = 0; i < courseCount; i++) {
                System.out.println((i + 1) + ". " + courses[i]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Enter number of courses you want to register: ");
        int numberOfCourses = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numberOfCourses; i++) {

            System.out.print("Enter course " + (i + 1) + ": ");
            String courseName = sc.nextLine();

            student.registerCourse(courseName);
        }

        student.displayCourses();

        sc.close();
    }
}