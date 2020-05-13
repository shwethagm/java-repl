public class P3ArraySum3 {
    static void test() {
        P3ArraySum3 obj = new P3ArraySum3();
        int[] array = {5, 1, 3, 4, 2};
        obj.sumOfNumbersInArray(array);
    }

    public void sumOfNumbersInArray(int[] array) {

        int sum = 0;
//        numbers[0] = 10;
//        numbers[1] = 100;
//        numbers[2] = 1000;
//        numbers[3] = 10000;
//        numbers[4] = 100000;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("sum:" + sum);
    }
}
