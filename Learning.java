public class Learning {
    static void test() {
        Learning obj = new Learning();
        obj.printStar(4);
    }

    public void printSpace(int n) {
        for (int i = 0; i < n; i++)
            System.out.print(" ");
    }

    public void printStar(int num) {

        for (int i = 0; i < num; i++) {
//            for (int k = 2 * (num - i); k >= 0; k--) // inner loop for spaces
//            {
//                System.out.print(" "); // printing space
//            }
            printSpace(num - 1 - i);

            for (int j = num - i - 1; j < num; j++) {
                System.out.print("*");
            }
            printSpace(num - 1 - i);

            System.out.println();
        }

    }
}
