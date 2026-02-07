import java.util.Arrays;
public class MaxProduct {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,-10,-90};
        Arrays.sort(arr);
        int n = arr.length;
        int MaxProduct1 = arr[n-1] * arr[n-2] * arr[n-3];
        int MaxProduct2 = arr[0] * arr[1] * arr[2];
        int res = Math.max(MaxProduct1,MaxProduct2);
        System.out.println (res);
        
    }
}