package LEETC.easy;

/**
 * @创建人：Administrator
 * @备注： 双指针
 */
public class num26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        int slow = 1, fast =1;
        int n = nums.length;
        while (fast < n) {
            if (nums[fast] != nums[fast - 1]){
             nums[slow] = nums[fast];
             slow++;
            }
            fast++;
        }
        return slow;
    }
}
