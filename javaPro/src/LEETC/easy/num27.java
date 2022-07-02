package LEETC.easy;

/**
 * @创建人：Administrator
 * @备注： nums = [0,1,2,2,3,0,4,2], val = 2
 */
public class num27 {
        public int removeElement(int[] nums, int val) {
            int n = nums.length;
            int left = 0; //避免了双循环
            for (int right = 0; right < n; right++) {
                if (nums[right] != val) {
                    nums[left] = nums[right];
                    left++;
                }
            }
            return left;
        }
}
