
import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0,0,4,6,8,0};
        int i = 0;
        for(int j = 1; j< nums.length; j++){
            if(nums[j] == 0){
                j++;
            }
            else if(nums[i] == 0){
                
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
