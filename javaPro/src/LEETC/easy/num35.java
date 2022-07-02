package LEETC.easy;

/**
 * @创建人：Administrator
 * @备注：官方使用二分查找O(LOGN)
 * [1,3,5,6], 2
 * 输出: 2
 */
public class num35 {

    public int searchInsert(int[] nums, int target) {
            int n = nums.length;
            int left = 0, right = n - 1, ans = n;
            while (left <= right) {
                int mid = ((right - left) >> 1) + left; // int mid = (left + right) / 2;
                if (target <= nums[mid]) {
                    ans = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return ans;
        }

    public int searchInsert1(int[] nums, int target) {
        int pos = 0;
        if (nums[nums.length-1] < target){
            return nums.length;
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] >= target){
                pos = i;
                break;
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        int a = 1;
        String s = "123";
        System.out.println(a+"");
    }
}
