import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n TO-DO LIST MENU");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println(" Task added.");
                    break;
                case 2:
                    System.out.println("\nYour Tasks:");
                    if (tasks.isEmpty()) {
                        System.out.println(" No tasks found.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter task number to remove: ");
                    int num = scanner.nextInt();
                    if (num > 0 && num <= tasks.size()) {
                        tasks.remove(num - 1);
                        System.out.println(" Task removed.");
                    } else {
                        System.out.println(" Invalid task number.");
                    }
                    break;
                case 4:
                    System.out.println(" Exiting To-Do List App.");
                    break;
                default:
                    System.out.println(" Invalid option.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
