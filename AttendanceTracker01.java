import java.util.*;

public class AttendanceTracker {
    public static void main(String[] args) {
        HashSet<String> attendance = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\n===== Attendance Tracker =====");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display Attendance List");
            System.out.println("5. Total Students Present");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name to mark present: ");
                    String name = sc.nextLine();
                    if (attendance.add(name)) {
                        System.out.println(name + " marked present!");
                    } else {
                        System.out.println(name + " is already marked present.");
                    }
                    break;

                case 2:
                    System.out.print("Enter student name to remove: ");
                    name = sc.nextLine();
                    if (attendance.remove(name)) {
                        System.out.println(name + " removed from attendance.");
                    } else {
                        System.out.println(name + " not found in attendance list.");
                    }
                    break;

                case 3:
                    System.out.print("Enter student name to search: ");
                    name = sc.nextLine();
                    if (attendance.contains(name)) {
                        System.out.println(name + " is present today.");
                    } else {
                        System.out.println(name + " is absent today.");
                    }
                    break;

                case 4:
                    System.out.println("\nToday's Attendance List:");
                    if (attendance.isEmpty()) {
                        System.out.println("No students marked present yet.");
                    } else {
                        for (String student : attendance) {
                            System.out.println("- " + student);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Total Students Present: " + attendance.size());
                    break;

                case 6:
                    System.out.println("Exiting Attendance Tracker... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 6);

        sc.close();
    }
}
