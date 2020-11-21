package collection;


import java.util.TreeSet;

public class ContainsNearbyAlmostDuplicate220 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> treeSet = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            long n = nums[i];
            Long low = treeSet.ceiling(n - t);
            if (low != null && low <= n + t) {
                return true;
            }
            treeSet.add(n);
            if (treeSet.size() > k) {
                treeSet.remove((long) nums[i - k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsNearbyAlmostDuplicate220 c = new ContainsNearbyAlmostDuplicate220();
        int[] nums = {2147483640, 2147483641};
        boolean values = c.containsNearbyAlmostDuplicate(nums, 1, 100);
        System.out.println(values);
    }
}
