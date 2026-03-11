public class FindEven {
    public static void main(String[] args) {
        int[] nums = {56,89,4,1171,24,44,68,91,102};
        int count = 0;
        int odd = 0;
        


        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 == 0) {
                count++;
            }
            else{
                odd++;
            }
            
        
    }
   
    System.out.println("Even No spotted"+count);
    System.out.println("Odd No spotted"+ odd);
    System.out.println("No no");
}
}
