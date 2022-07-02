package LEETC.other;

import java.util.HashSet;

/**
 * @创建人：Administrator
 * @备注：
 */
public class offer_03 {
    public static int findRepeatNumber(int nums[]){
        HashSet set = new HashSet();
        for (int num:nums){
            if (set.contains(num)){
                return num;
            }else{
                set.add(num);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,1,2};
        System.out.println(findRepeatNumber(nums));
        System.out.println(1+3/2);
        String s1 ="abc";
        String s2 ="abc";
        System.out.println(s1==s2);
        StringBuilder s = new StringBuilder("StringBuilder");
        StringBuffer ss = new StringBuffer("StringBuffer");
        System.out.println(s.append("111"));
        System.out.println(ss.append("111"));
    }
}
