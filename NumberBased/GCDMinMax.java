
import java.util.Arrays;

public class GCDMinMax {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,8,10,4};

        Arrays.sort(arr);
        int n1 = arr[0];
        int n2 = arr[arr.length - 1];

        while(n1 % n2 != 0){
            int temp = n1 % n2;
            n1 = n2;
            n2 = temp;
        }
        System.out.println(n2);
    }
}
