import java.util.Scanner;

public class Patient {

    int patientId;
    String name;
    int age;
    double temperature;

    void checkFever() {

        if (temperature > 100.4) {
            System.out.println("Fever");
        } else {
            System.out.println("Normal");
        }
    }

    void displayPatient() {

        System.out.println("\n----- Patient Details -----");
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Temperature: " + temperature + " F");

        System.out.print("Status: ");
        checkFever();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Patient patient = new Patient();

        System.out.print("Enter Patient ID: ");
        patient.patientId = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Patient Name: ");
        patient.name = sc.nextLine();

        System.out.print("Enter Age: ");
        patient.age = sc.nextInt();

        System.out.print("Enter Temperature (F): ");
        patient.temperature = sc.nextDouble();

        patient.displayPatient();

        sc.close();
    }
}
