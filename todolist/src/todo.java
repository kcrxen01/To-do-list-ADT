import java.util.*;

public class todo {
        private Scanner scan;
        private ArrayList<String> tasks;

    public todo() {
        scan = new Scanner(System.in);
        tasks = new ArrayList<String>();
    }

    public void showmenu(){
            System.out.print("TO DO LIST MENU\n");
            System.out.print("1: ADD LIST\n");
            System.out.print("2: REMOVE LIST\n");
            System.out.print("3: VIEW LIST\n");
            System.out.print("4: EXIT THE PROGRAM\n");
            System.out.print("Enter your choice: ");
    }

    public void addlist(){
        System.out.print("Add a task: ");
        String task = scan.nextLine();

        if(task.isEmpty()){
            System.out.print("Dele lagi pwede empty ang task.");
            return;
        }
        tasks.add(task);
        System.out.print("Task " + task + " is successfully added\n");

    }

    public void removelist(){
        System.out.print("Your current tasks: \n");
        for(int i = 0; i < tasks.size(); i++){
            System.out.print(tasks.get(i) + "\n");
        }

        System.out.print("Pili ug task na idelete nimo: ");
        String task = scan.nextLine();

        if(tasks.remove(task)){
            System.out.print("Task removed: " + task + "\n");
        } else {
            System.out.print("Task is not found\n");
        }
    }

    public void viewlist(){
        if(tasks.isEmpty()){
            System.out.print("Wala paman kay list??\n");
        } else {
            System.out.print("Your to-do list: \n");
            for(int i = 0; i < tasks.size(); i++){
                System.out.print(tasks.get(i) + "\n");
            }
        }
    }
}
