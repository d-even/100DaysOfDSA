public class MaxNo {
    public static void main(String[] args) {
        int[] nums = {1,2,4,7,10,9,3,};
        int max = nums[0];
        for (int n : nums) {
            if (n > max){
                max = n;
                System.out.println(max);
            }
        }
    }
    
   

}
public class MaxNo {
    public static void main(String[] args) {
        int[] nums = {1,2,4,7,10,9,3};
        int max = nums[0];

        for (int n : nums) {
            if (n > max){
                max = n;
            }
        }

        System.out.println("Maximum number is: " + max);
    }
}
