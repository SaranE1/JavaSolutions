import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        DemoStack stack = new DemoStack();
        System.out.println("Enter number of value : ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        System.out.println("Your stack");
        for (int i = 0; i < a; i++) {
            list.add((int) (Math.random() * 100));
        }
        for (Integer l : list) {
            System.out.println(l.toString());
        }

        System.out.println("Push (1) and Pop(2)");
        a = s.nextInt();
        switch (a) {
            case 1:
                System.out.println("Enter Number of Values to be pushed");
                a = s.nextInt();
                for (int i = 0; i < a; i++) {
                    stack.push(list);
                }
                break;
            case 2:
                System.out.println("Enter Number of Values to be popped");
                a = s.nextInt();
                for (int i = 0; i < a; i++) {
                    stack.pop(list);
                }
                break;
            default:
                break;
        }

        System.out.println("updated stack");

        for (Integer l : list) {
            System.out.println(l.toString());
        }

        s.close();
    }
}