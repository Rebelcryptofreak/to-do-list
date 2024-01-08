import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    private ArrayList<String> tasks;
    
    public ToDoList() {
        tasks = new ArrayList<String>();
    }
    
    public void addTask(String task) {
        tasks.add(task);
    }
    
    public void removeTask(int index) {
        tasks.remove(index);
    }
    
    public void printTasks() {
        System.out.println("Tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i+1) + ". " + tasks.get(i));
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();
        
        while (true) {
            System.out.println("Enter a command (add, remove, or print):");
            String command = scanner.nextLine();
            
            if (command.equals("add")) {
                System.out.println("Enter a task:");
                String task = scanner.nextLine();
                toDoList.addTask(task);
            } else if (command.equals("remove")) {
                System.out.println("Enter the index of the task to remove:");
                int index = scanner.nextInt();
                scanner.nextLine();
                toDoList.removeTask(index-1);
            } else if (command.equals("print")) {
                toDoList.printTasks();
            } else {
                System.out.println("Invalid command.");
            }
        }
    }
}
