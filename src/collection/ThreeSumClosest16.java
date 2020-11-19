package collection;

import java.util.Arrays;

public class ThreeSumClosest16 {

    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);

        int length = nums.length;
        int best = 10000;

        for (int i = 0; i < length - 1; i++) {
            int l = i + 1;
            int r = length - 1;

            while (l < r) {

                int sum = nums[i] + nums[l] + nums[r];
                if (sum == target) {
                    return target;
                }
                if (Math.abs(sum - target) < Math.abs(best - target)) {
                    best = sum;
                }

                if (sum > target) {
                    while (l < r && nums[r] == nums[r - 1]) {
                        r--;
                    }
                    r--;
                } else {
                    while (l < r && nums[l + 1] == nums[l]) {
                        l++;
                    }
                    l++;
                }
            }
        }


        return best;
    }
}
