import java.util.ArrayList;
import java.util.Scanner;

public class P3ArrayListGetListSize3 {
    static void test() {
        P3ArrayListGetListSize3 obj = new P3ArrayListGetListSize3();
        obj.getListSize();
    }

    public void getListSize() {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> li = new ArrayList<>();
        String str;
        int count = 0;
        System.out.println("Enter the Strings");
        while (true) {
            str = scanner.nextLine();
            if (str.isEmpty()) {
                break;
            }
            li.add(str);
            count = count + 1;

        }
        //Printing first value of the list
        System.out.println(li.get(0));
        //Printing last value of the list
        System.out.println(li.get(li.size() - 1));
        //Printing Size of the list
        System.out.println("List Size" + count);
    }

}
