import java.util.ArrayList;

public class GreatestCommonDivisors {
    ArrayList<Integer> li;

    static void test() {
        GreatestCommonDivisors obj = new GreatestCommonDivisors();

        System.out.println(obj.getGcd(100, 1000));
        System.out.println(obj.getGcd(4, 2));
        System.out.println(obj.getGcd(36, 48));
        System.out.println(obj.getGcd(96, 144));

    }

    public int getGcd(int num1, int num2) {
        li = new ArrayList<Integer>();
        for (int i = 2; i < num1 && i < num2; i++) {

            if ((num1 % i == 0) && (num2 % i == 0)) {
                li.add(i);

            }
            // System.out.println(li);
            //return li.get(li.size() - 1);
        }
        int elem = li.size();
        //System.out.println(elem);
//        if (elem == 0) {
//
//        }
        int result = elem - 1;
        // System.out.println(result);
        return li.get(result);

    }

}

