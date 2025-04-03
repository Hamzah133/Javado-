import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Task Manager ===");
            System.out.println("1. Add Task");
            System.out.println("2. List Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter description: ");
                    String description = scanner.nextLine();
                    System.out.print("Is task complete: ");
                    Boolean status = Boolean.valueOf(scanner.nextLine());
                    manager.addTask(new Task(title,description,status));
                    break;
                case 2:
//                    System.out.println("Tasks: " + manager.listTasks());
                    manager.listTasks();
                    break;
                case 3:
                    System.out.print("Enter task to delete: ");
                    System.out.print("Enter title: ");
                    String title1 = scanner.nextLine();
                    System.out.print("Enter description: ");
                    String description1 = scanner.nextLine();
                    System.out.print("Is task complete: ");
                    Boolean status1 = Boolean.valueOf(scanner.nextLine());
                    String task = scanner.nextLine();
                    manager.deleteTask(new Task(title1,description1,status1));
                    System.out.println("Deleting...");
                    break;
                case 4:
                    manager.exit();
                    System.out.println("Exiting......");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}