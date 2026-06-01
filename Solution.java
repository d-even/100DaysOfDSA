import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {

        Integer[] arr = {1, 3, 2};
        int total = 0;

        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 != 2) {
                total += arr[i];
System.out.println(arr[i]);
            }
        }
        

        System.out.println(total);
    


        // int n = 234;
        // int product = 1;
        // int sum = 0;
        // int diff = 0;

        // while(n != 0){
        //     int digit = n % 10;
        //     product = product * digit;
        //     sum = sum + digit;
        //     n = n / 10;
        // }
        // diff = product - sum;
        // System.out.println(diff);
        }
        
    
}
