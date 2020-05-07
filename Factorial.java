class Factorial {

    static void test() {
        new Factorial().getFactorial(5);
        new Factorial().getFactorial(10);
        new Factorial().getFactorial(11);

    }

    public static int getFactorial(int num) {

        if (num == 1) {
            return 1;
        }
        int i = num;
        int fact = 1;

        int result = fact * Factorial.getFactorial(num - 1);
        System.out.println(result);
        return result;
    }

}