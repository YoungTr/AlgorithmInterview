package collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Intersect350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<>();
        for (int n1 : nums1) {
            map1.put(n1, map1.getOrDefault(n1, 0) + 1);
        }

        int[] res = new int[nums1.length];
        int dx = 0;
        for (int n2 : nums2) {
            if (!map1.containsKey(n2)) {
                continue;
            }
            res[dx++] = n2;
            Integer count = map1.get(n2);
            count--;
            if (count > 0) {
                map1.put(n2, count);
            } else {
                map1.remove(n2);
            }

        }

        return Arrays.copyOfRange(res, 0, dx);

    }
}
