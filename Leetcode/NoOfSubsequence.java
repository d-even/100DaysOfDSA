
public class NoOfSubsequence {
    public static void main(String[] args) {
        
        int[] arr = {3,5,6,8};
        int target = 10;
        int i = 0;
        int res =0;
        
        for (int j = 0; j < arr.length; j++) {
            if(arr[i] + arr[j] <= target){
                res++;
                
            }
        }
       
        System.out.println(res+1);
    }
}
