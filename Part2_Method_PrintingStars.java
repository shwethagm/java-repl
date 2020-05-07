public class Part2_Method_PrintingStars {
    static void test() {
        printReverseTriangle(4);

    }

    public static void printStars(int num) {
        int i = 0;
        while (i < num) {
            System.out.print("*");
            i++;

        }
        System.out.println();
    }

    public static void printSquare(int num) {
        int i = 0;
        while (i < num) {
            System.out.print("*");
            i++;

        }
        System.out.println();
    }

    public static void printRectangle(int width, int height) {
        int i = 0;
        for (i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }

    public static void printTriangle(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printReverseTriangle(int num) {
        int i = 0;
        for (i = num; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}