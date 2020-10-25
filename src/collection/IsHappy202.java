package collection;

import java.util.HashSet;
import java.util.Set;

public class IsHappy202 {

    public boolean isHappy(int n) {
        Set<Integer> res = new HashSet<>();
        int value = n;

        while (true) {
            value = getNext(value);
            if (res.contains(value)) {
                return false;
            }
            if (value == 1) {
                return true;
            }
            res.add(value);
        }
    }

    public boolean isHappy2(int n) {
        int slowRunner = n;
        int fastRunner = getNext(n);
        while (fastRunner != 1 && slowRunner != fastRunner) {
            slowRunner = getNext(slowRunner);
            fastRunner = getNext(getNext(fastRunner));
        }
        return fastRunner == 1;
    }



    public int getNext(int num) {

        int s = 0;


        while (num != 0) {
            int c = num % 10;
            s += c * c;
            num = num / 10;
        }

        return s;
    }

    public static void main(String[] args) {
        int sum = new IsHappy202().getNext(1);
        System.out.println(sum);
    }

}
