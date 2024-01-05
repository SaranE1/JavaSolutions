import java.util.List;
import java.util.Scanner;

public class DemoStack {
    public void push(List<Integer> l) {
        System.out.println("Enter the value to be push");
        Scanner s = new Scanner(System.in);
        int value = s.nextInt();
        l.add(value);
        // s.close();
    }

    public void pop(List<Integer> l) {
        if (!l.isEmpty()) {
            l.remove(l.size() - 1);
        } else {
            System.out.println("List is empty");
        }
    }
}