package LEETC.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @创建人：Administrator
 * @备注：杨辉三角  List<List<Integer>> 类似于二维数组
 */
public class num118 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                 if (j == 0 || j == i){
                    row.add(1);
                 }else{
                    row.add(ret.get(i-1).get(j-1)+ret.get(i-1).get(j));
                 }
            }
        ret.add(row);
        }
        return ret;
    }

    public static void main(String[] args) {
        List<List<Integer>> ret = num118.generate(4);
        List<Integer> row = ret.get(3);
        for (Integer it : row) {
            System.out.println(it);
        }

    }
}
