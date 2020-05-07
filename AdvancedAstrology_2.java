public class AdvancedAstrology_2 {
    static void test() {
        printTriangle(4);

    }

    public static void printTriangle(int size) {
        int i = 0;
        for (i = 0; i > size; i++) {

            System.out.print(" ");
        }
        for (int j = 0; j >= i; j++) {

            System.out.print("*");
        }
        System.out.println(" ");
    }

//    public void printSpaces(int num) {
//        int i = 0;
//        while (i < num)
//            System.out.print(" ");
//        i++;
//    }
}
