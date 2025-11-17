package project.HospitalManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class HospitalManagement {

    private static ArrayList<Patient> patients = new ArrayList<>();
    private static ArrayList<Doctor> doctors = new ArrayList<>();
    private static ArrayList<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Hospital Management System");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Schedule Appointment");
            System.out.println("4. View Patients");
            System.out.println("5. View Doctors");
            System.out.println("6. View Appointments");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addPatient(scanner);
                    break;
                case 2:
                    addDoctor(scanner);
                    break;
                case 3:
                    addAppointment(scanner);
                    break;
                case 4:
                    viewPatients();
                    break;
                case 5:
                    viewDoctors();
                    break;
                case 6:
                    viewAppointments();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);
    }

    // ------------------- Add Patient --------------------
    private static void addPatient(Scanner scanner) {
        scanner.nextLine(); // consume newline
        System.out.print("Enter Patient Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Patient Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Patient Gender: ");
        String gender = scanner.next();

        Patient patient = new Patient(name, gender, age);
        patients.add(patient);

        System.out.println("Patient added successfully!");
    }

    // ------------------- Add Doctor --------------------
    private static void addDoctor(Scanner scanner) {
        scanner.nextLine();
        System.out.print("Enter Doctor Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Specialization: ");
        String specialization = scanner.nextLine();

        Doctor doctor = new Doctor(name, specialization);
        doctors.add(doctor);

        System.out.println("Doctor added successfully!");
    }

    // ------------------- Add Appointment --------------------
    private static void addAppointment(Scanner scanner) {
        if (patients.isEmpty() || doctors.isEmpty()) {
            System.out.println("Please add both patients and doctors first.");
            return;
        }

        System.out.println("Select Patient ID: ");
        for (int i = 0; i < patients.size(); i++) {
            System.out.println(i + ". " + patients.get(i));
        }
        int pId = scanner.nextInt();

        System.out.println("Select Doctor ID: ");
        for (int i = 0; i < doctors.size(); i++) {
            System.out.println(i + ". " + doctors.get(i));
        }
        int dId = scanner.nextInt();

        Appointment appointment = new Appointment(patients.get(pId), doctors.get(dId), null);
        appointments.add(appointment);

        System.out.println("Appointment scheduled successfully!");
    }

    // ------------------- View Patients --------------------
    private static void viewPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients found.");
            return;
        }
        patients.forEach(System.out::println);
    }

    // ------------------- View Doctors --------------------
    private static void viewDoctors() {
        if (doctors.isEmpty()) {
            System.out.println("No doctors found.");
            return;
        }
        doctors.forEach(System.out::println);
    }

    // ------------------- View Appointments --------------------
    private static void viewAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments scheduled.");
            return;
        }
        appointments.forEach(System.out::println);
    }
}
