package niuke.第k大的数;
import java.util.*;
/**
 * @创建人：Administrator
 * @备注：使用快速排序，因为时间复杂度由 O()nlogn-->O()n
 */
public class Main1 {
    public static void main(String[] args) {
        int[] a = {5,4,1,2,3};
        int K = 3;
        int n = 5;

        int result = findKth(a,n,K);
        System.out.println(result);
    }
    public static int findKth(int[] a, int n, int K) {
        // write code here
        return quickSort(a, 0, n - 1, K);
    }
    private static int quickSort(int[] arr, int low, int high, int K){
        int p = partion(arr,low,high);
        if(p-low+1 == K){
          return arr[p];
        }
        if(p-low+1 > K){
            return quickSort(arr,low,p-1,K);
        }
        else{
            return quickSort(arr,p+1,high,K-(p-low+1));
        }
    }
    private static int partion(int[] arr, int low, int high){
        int temp = arr[low];
        while(low<high){
            while(low<high && arr[high]<temp){
                high--;
            }
            if (high==low){
                break;
            }else{
                arr[low] = arr[high];
            }
            while(low<high && arr[low]>temp){
                low++;
            }
            if (high==low){
                break;
            }else{
                arr[high] = arr[low];
            }
        }
        arr[low] = temp;
        return low;
    }
}
