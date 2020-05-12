import java.util.Scanner;

public class P3Array1Swap {
    static void test() {
        P3Array1Swap obj = new P3Array1Swap();
        obj.swapTwo();
    }

    public void swapTwo() {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        //  numbers = Integer.valueOf(scanner.nextLine());
        numbers[0] = 10;
        numbers[1] = 100;
        numbers[2] = 1000;
        numbers[3] = 10000;
        numbers[4] = 100000;

        System.out.println("Which index should we access? ");
        int index = Integer.valueOf(scanner.nextLine());
        int index1 = Integer.valueOf(scanner.nextLine());

        int number = numbers[index];
        int num1 = numbers[index1];
        for (int i = 0; i < numbers.length; i++) {
            int temp = numbers[index];
            numbers[index] = numbers[index1];
            numbers[index1] = temp;
            System.out.println(numbers[i]);
        }

        // System.out.println(numbers[1]);

    }
}


