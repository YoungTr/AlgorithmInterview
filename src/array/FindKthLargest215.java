package array;

import java.util.Random;

public class FindKthLargest215 {

    public int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        int low = 0;
        int high = len - 1;
        int targetIndex = len - k;


        while (true) {
            int i = partition(nums, low, high);
            if (i == targetIndex) {
                return nums[i];
            } else if (i < targetIndex) {
                low = i + 1;
            } else {
                high = i - 1;
            }
        }

    }

    private int partition(int[] nums, int low, int high) {
        if (high > low) {
            //在下标 low 和 high 之间随机选择，然后和下标 high 元素进行交换
            int random = low + new Random().nextInt(high - low);
            swap(random, high, nums);
        }

        int i = low;
        int pivot = nums[high];

        for (int j = low; j < high; j++) {
            if (nums[j] < pivot) {
                if (i != j) {
                    swap(i, j, nums);
                }
                i++;
            }
        }

        swap(i, high, nums);

        return i;
    }


    public void swap(int a, int b, int[] nums) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
