package collection;

import java.util.HashMap;
import java.util.Map;

public class FourSumCount454 {

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int a : A) {
            for (int b : B) {
                int ab = a + b;
                map.put(ab, map.getOrDefault(ab, 0) + 1);
            }
        }


        for (int value : C) {
            for (int i : D) {
                int cd = -(value + i);
                if (map.containsKey(cd)) {
                    res += map.get(cd);
                }
            }
        }
        return res;
    }
}
