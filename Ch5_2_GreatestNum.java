public class Ch5_2_GreatestNum {

    public static void test() {
        Ch5_2_GreatestNum obj = new Ch5_2_GreatestNum();
        System.out.println(obj.greatestNumber(100, 200, 300, 200));
        System.out.println(obj.greatestNumber(-2, 3, 4, 5));
        System.out.println(obj.greatestNumber(100, 50, 20, 1));
        System.out.println(obj.greatestNumber(100, 3, -200, 100));
        System.out.println(obj.greatestNumber(100, 3, 1, 1000));
        System.out.println(obj.greatestNumber(1, 100, 4, 5));

    }

    public int greatestNumber(int num1, int num2, int num3, int num4) {
        if (num1 > num2) {
            if (num1 > num3) {
                if (num1 > num4) {
                    return num1;
                } else {
                    return num4;
                }
            } else if (num3 > num4) {
                return num3;
            } else {
                return num4;
            }
        } else if (num2 > num3) {
            if (num2 > num4) {
                return num2;
            } else {
                return num4;
            }
        } else if (num3 > num4) {
            return num3;
        } else
            return num4;
    }
}