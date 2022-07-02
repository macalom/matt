package LEETC.easy;

/**
 * @创建人：Administrator
 * @备注：比一半
 */
public class num9 {
    public boolean isPalindrome(int x) {
        int reverse = 0;

        if (x < 0 ||( x % 10 ==0 && x != 0)){
            return false;
        }
        while (x > reverse){
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        return x == reverse || x == reverse / 10;
    }

    public static void main(String[] args) {
        num9 n = new num9();
        System.out.println(n.isPalindrome(121));
    }
}
