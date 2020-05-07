class Part3Method5 {

    public static void test() {
        Part3Method5 obj = new Part3Method5();
        obj.division(3, 2);
    }

    public void division(int first, float second) {
        System.out.println("" + first + " / " + second + " = " + (first / second));
    }

    public void divisibleBy3(int begin, int end) {
        for (int i = begin; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public void divisibleBy3While(int begin, int end) {
        int i = begin;
        while (i < end) {

            if (i % 3 == 0) {
                System.out.println(i);

            }
            i++;
        }
    }
}