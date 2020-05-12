import java.util.Scanner;

public class P3ArrayIndexFind2 {

    static void test() {
        P3ArrayIndexFind2 obj = new P3ArrayIndexFind2();
        obj.findIndex();
    }

    public void findIndex() {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 100;
        numbers[2] = 1000;
        numbers[3] = 10000;
        numbers[4] = 100000;
        int i = 0;
        while (i < numbers.length) {

            System.out.println("Enter the number to search");

            int num = Integer.valueOf(scanner.nextLine());
            if (num == numbers[i]) {
                System.out.println(num + " is at index " + i);
                break;
            } else {
                System.out.println(num + " was not found");
                break;
            }
        }

    }
}
