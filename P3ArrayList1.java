import java.util.ArrayList;
import java.util.Scanner;

public class P3ArrayList1 {
    static void test() {
        P3ArrayList1 obj = new P3ArrayList1();
        obj.addWords();
    }

    public void addWords() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> li = new ArrayList<>();
        String str;
        while (true) {

            System.out.println("Enter the words");
            str = scanner.nextLine();
            if (str.isEmpty())
                break;
            li.add(str);

        }
        //  System.out.println(li);
        if (li.size() > 2) {
            System.out.println(li.get(2));
        }
    }
}