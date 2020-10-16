package array.tow_pointer;

public class Merge88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] copy = new int[m];
        System.arraycopy(nums1, 0, copy, 0, m);

        int p1 = 0;
        int p2 = 0;
        int p = 0;
        while (p1 < m && p2 < n) {
            if (nums2[p2] < copy[p1]) {
                nums1[p++] = nums2[p2++];
            } else {
                nums1[p++] = copy[p1++];
            }
        }

        if (p1 < m) {
            System.arraycopy(copy, p1, nums1, p, m - p1);
        }

        if (p2 < n) {
            System.arraycopy(nums2, p2, nums1, p, n - p2);
        }

    }


    public void merge2(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m - 1;
        int p2 = n - 1;

        int p = m + n - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p--] = nums1[p1--];
            } else {
                nums1[p--] = nums2[p2--];
            }
        }

        // add missing elements from nums2
        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);

    }
}
