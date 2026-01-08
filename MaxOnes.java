public class MaxOnes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 0, 1, 1, 1, 0};
        int maxNum =0;
        int count = 0;

        for(int i = 0; i <nums.length;i++){

            if(nums[i] == 1){
                count++;
                maxNum = Math.max(maxNum,count);
            }
            else{
                count = 0;
        }

        
    }
    System.out.println(maxNum);
}
}
