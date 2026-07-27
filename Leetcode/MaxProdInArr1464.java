
import java.util.Arrays;

public class MaxProdInArr1464{
    public static void main(String[] args){
        int[] arr = {3,4,5,2};
        int n = arr.length;
        Arrays.sort(arr);

        int result = (arr[n-1] -1) * (arr[n-2] - 1);

        System.out.println(result);
    }
}