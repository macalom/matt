package LEETC.easy;

/**
 * @创建人：Administrator
 * @备注：int 范围-2,147,483,648 到 2,147,483,647
 */
public class num7 {
    public int reverse(int x) {
        int rev = 0, pop = 0;
        while (x != 0){
            pop = x % 10;
            x /= 10;
            if (rev>Integer.MAX_VALUE/10||(rev == Integer.MAX_VALUE / 10 && pop > 7))return 0;
            if (rev<Integer.MAX_VALUE/10||(rev == Integer.MAX_VALUE / 10 && pop < -8))return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
