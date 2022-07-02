package LEETC.easy;

/**
 * @创建人：Administrator
 * @备注：二分法
 */
public class num69 {
    public int mySqrt(int x) {
        int ans = -1, l = 0, r = x;
        while (l<=x){
            int mid = l + (r - l) / 2;
            if ((long)(mid * mid) <= x){
                ans = mid;
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return ans;
    }
}
