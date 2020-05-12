import java.util.ArrayList;
import java.util.Scanner;

public class P3ArrayList2 {

    static void test() {
        P3ArrayList2 obj = new P3ArrayList2();
        obj.addNumbers();
    }

    public void addNumbers() {

        Scanner scanner = new Scanner(System.in);

        int num;

        ArrayList<Integer> li = new ArrayList<Integer>();

        while (true) {

            System.out.println("Enter the numbers");
            num = Integer.valueOf(scanner.nextLine());
            if (num == 0) {
                break;
            }
            li.add(num);

        }
        System.out.println(li);
        int sum = 0;
        if (li.size() > 2) {

            sum = li.get(1) + li.get(2);
            System.out.println("sum:" + sum);
        }
    }
}

