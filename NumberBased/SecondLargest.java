
import java.util.Arrays;

public class SecondLargest{
    public static void main(String[] args){
        int[] nums = {3,4,5,6,2,7,7};
        int SecondMax = 0;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if(nums[0] < nums[i]){
                SecondMax = nums[i];

                if(SecondMax == nums[i - 1]){
                    i--;
System.out.println(nums[i]);
                }
            }
            
        }
        System.out.println(SecondMax);
        

        System.out.println(Arrays.toString(nums));
        
    }
}