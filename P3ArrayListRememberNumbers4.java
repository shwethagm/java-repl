import java.util.ArrayList;
import java.util.Scanner;

public class P3ArrayListRememberNumbers4 {
    static void test() {
        P3ArrayListRememberNumbers4 obj = new P3ArrayListRememberNumbers4();
        obj.getNumbers();
    }

    public void getNumbers() {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> li = new ArrayList<>();
        System.out.println("enter the numbers");
        int num;
        while (true) {
            //
            num = Integer.valueOf(scanner.nextLine());
            if (num == -1) {
                break;
            }
            li.add(num);
            //    System.out.println(i);
        }
        //iterating through the list
        for (int i : li) {
            System.out.println(i);
        }
        //range

    }

}