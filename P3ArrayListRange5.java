import java.util.ArrayList;
import java.util.Scanner;

public class P3ArrayListRange5 {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();
    int num;
    int index = 0;

    static void test() {
        P3ArrayListRange5 obj = new P3ArrayListRange5();
        obj.getRange();
    }

    public void getRange() {
        System.out.println("Enter the numbers");
        while (true) {
            num = Integer.valueOf(scanner.nextLine());
            if (num == -1) {
                break;
            }
            list.add(num);
            index = index + 1;
        }
        System.out.println(list);

        int start = Integer.valueOf(scanner.nextInt());
        System.out.println(start);

        int end = Integer.valueOf(scanner.nextInt());
        System.out.println(end);
        // int greatest = list.get(0);
        for (int i = start; i < end; i++) {

            System.out.println(list.get(i));
        }

    }

}
