package LEETC.easy;

import java.util.Arrays;

/**
 * @创建人：Administrator
 * @备注：合并两个有序数组,1.合并后排序。2.
 */
public class num88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i != n; ++i) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}
