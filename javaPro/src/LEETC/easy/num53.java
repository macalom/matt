package LEETC.easy;

/**
 * @创建人：Administrator
 * @备注： 利用动态规划
 */
public class num53 {
    public int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x); //如果x比之前的pre要大，那么就意味着需要重新开头了
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }
}
