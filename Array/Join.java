
import java.util.Arrays;

public class Join{
    public static void main(String[] args) {
       int[] arr = {2,5,7,9,10,25,15,89,20};
        Arrays.sort(arr);
       int large = 0;

       for(int i =0;i < arr.length; i++){
        if(arr[i] % 5 == 0){
            System.out.println(arr[i]);
            large = arr[i -1];
            // System.out.println(large);
        }
       }
 
    }
}