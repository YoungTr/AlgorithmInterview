package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection439 {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<>();
        for (int num : nums1) {
            s.add(num);
        }
        Set<Integer> res = new HashSet<>();

        for (int n2 : nums2) {
            if (s.contains(n2)) {
                res.add(n2);
            }
        }


        int[] output = new int[res.size()];
        int dx = 0;
        for (int n3 : res) {
            output[dx++] = n3;
        }
        return output;

    }
}
