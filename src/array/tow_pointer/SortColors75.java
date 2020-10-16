package array.tow_pointer;

public class SortColors75 {

    public void sortColors(int[] nums) {
        int[] counts = new int[3];
        for (int num : nums) {
            counts[num]++;
        }


        int k = 0;

        for (int i = 0; i < counts.length; i++) {
            int count = counts[i];
            for (int j = 0; j < count; j++) {
                nums[k++] = i;
            }
        }

    }


    public void sortColors2(int[] nums) {
        int n = nums.length;
        int ptr = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                swap(i, ptr, nums);
                ++ptr;
            }
        }

        for (int i = ptr; i < n; i++) {
            if (nums[i] == 1) {
                swap(i, ptr, nums);
                ++ptr;
            }
        }

    }

    /**
     * partition
     *
     * @param nums array
     */
    public void sortColors3(int[] nums) {
        int zero = -1;            // nums[0...zero] == 0
        int two = nums.length;    // nums[two...n-1] == 2

        for (int i = 0; i < two; ) {
            if (nums[i] == 1) {
                i++;
            } else if (nums[i] == 2) {
                --two;
                swap(i, two, nums);
            } else {
                ++zero;
                swap(i, zero, nums);
                i++;
            }
        }

    }

    public void swap(int a, int b, int[] nums) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
