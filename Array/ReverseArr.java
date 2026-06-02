import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] arg){
        int[] arr ={5,6,1,4,9};
        int left =0;
        int right = arr.length -1;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
