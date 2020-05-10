public class GreatestNumber {
    static void test() {
        getGreatest(1, 10, 9);
        getGreatest(100, 10, 9);
        getGreatest(1, 10, 90);
        getGreatest(100, 10, 900);
        getGreatest(1, -10, 9);

    }

    public static int getGreatest(int num1, int num2, int num3) {

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println(num1);
                return num1;
            } else {
                System.out.println(num3);
                return num3;
            }

        } else if (num2 > num3) {
            System.out.println(num2);
            return num2;

        } else {
            System.out.println(num3);
            return num3;
        }

    }
}
