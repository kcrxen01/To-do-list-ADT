import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       todo list = new todo();

       while(true){
        list.showmenu();
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        switch(num) {
            case 1:
                list.addlist();
                break;
            case 2:
                list.removelist();
                break;
            case 3:
                list.viewlist();
                break;
            case 4:
                System.out.print("EXITING THE PROGRAM");
                return;
            default:
                System.out.print("wala mana sa choices??\n");
                break;
            }
        }
    }
}