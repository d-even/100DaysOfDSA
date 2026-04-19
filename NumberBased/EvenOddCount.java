public class EvenOddCount{
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11};
        
        int count = 0;
        int odd = 0;

        for (int i = 0; i <nums.length; i++) {
            
            if (nums[i] % 2 == 0) {
                count++;
            }
            else {
                odd++;
            }
        }
        System.out.println("Even Numbers are:"+count);
        System.out.println("Odd Numbers are:"+odd);
    }

}