package array.tow_pointer;

public class RemoveDuplicates80 {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[j]) {
                count++;
            } else {
                count = 1;
            }
            if (count <= 2) {
                j++;
                if (j != i) {
                    nums[j] = nums[i];
                }
            }
        }

        return j + 1;
    }
}
