public class Aug1{
    public static void main(String[] args) {
        int[] nums = {1,5,2,1,89};
        int player1 = nums[0];
        int player2 = 0;
        boolean result = true;

        for(int i = 1; i<nums.length;i++){
            if (i % 2 == 0) {
                player1 += nums[i];
            }
            else{
                player2 += nums[i];
            }
            
        }
        if (player1 > player2) {
                
            }
            else{
                result = false;
            }
            System.out.println(player1);
            System.out.println(player2);
            System.out.println(result);

    }
}