package array.sliding_window;

public class MinSubArrayLen209 {
    public int minSubArrayLen(int s, int[] nums) {
        int l = 0, r = -1; // nums[l...r] 所有元素 <= s
        int sum = 0;
        int res = Integer.MAX_VALUE;

        while (l < nums.length) {
            if (r < nums.length - 1 && sum < s) {
                r++;
                sum += nums[r];
            } else {
                sum -= nums[l++];
            }

            if (sum >= s) {
                res = Math.min(res, r - l + 1);
            }

        }

        if (res == Integer.MAX_VALUE) {
            res = 0;
        }

        return res;
    }
}
