import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of tasks: ");
        int n = sc.nextInt();
        sc.nextLine();

        // Add tasks to ArrayList
        for (int i = 0; i < n; i++) {
            System.out.print("Enter task " + (i + 1) + ": ");
            String task = sc.nextLine();
            tasks.add(task);
        }

        // Display tasks using StringBuffer
        StringBuffer display = new StringBuffer();
        display.append("\n--- To-Do List ---\n");

        for (int i = 0; i < tasks.size(); i++) {
            display.append((i + 1) + ". " + tasks.get(i) + "\n");
        }

        System.out.println(display);

        sc.close();
    }
}