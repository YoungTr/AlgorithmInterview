package array.tow_pointer;

public class MoveZeroes283 {
    public void moveZeroes(int[] nums) {
        int k = 0; // nums中，[0...k) 的元素均为非0元素
        // 遍历第 i 个元素，保证[0...i] 中所有非0元素
        // 都按照顺序排列在[0...k)中
        // 同时[k...i]为0
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (k != i) {
                    // 交换数据
                    int temp = nums[i];
                    nums[i] = nums[k];
                    nums[k] = temp;
                }
                k++;
            }
        }
    }
}
