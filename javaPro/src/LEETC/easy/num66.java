package LEETC.easy;

/**
 * @创建人：Administrator
 * @备注：
 */
public class num66 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits= new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        int[] digits = {9,9,9};
        digits= new int[digits.length + 1];
        digits[0] = 0;
        for (int i = 0; i < digits.length; i++) {
            System.out.println(digits[i]);;

        }
    }
}
