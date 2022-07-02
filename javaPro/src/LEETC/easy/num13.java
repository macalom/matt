package LEETC.easy;

/**
 * @创建人：Administrator
 * @备注：或者用s = s.replace("IV","a");
 */
public class num13 {
    public int romanToInt(String s) {
        int sum = 0;
        int preNum = switcher(s.charAt(0));
        for (int i = 1; i < s.length(); i++){
            int num = switcher(s.charAt(i));
            if (preNum < num){
                sum -= preNum;
            }
            if (preNum > num){
                sum += preNum;
            }
            preNum = num;
        }
        sum += preNum;
        return sum;
    }
    public int switcher(char c){
        switch (c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }

    }


    public static void main(String[] args) {
        num13 n = new num13();
        System.out.println(n.romanToInt("MCMXCIV"));
    }
}
