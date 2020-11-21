package collection;

import java.util.HashSet;
import java.util.Set;

public class ContainsNearbyDuplicate219 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        // set 查找O(1)
        // list 查找O(n) 超时
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (set.contains(n)) {
                return true;
            }
            set.add(n);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }

        return false;


    }
}
