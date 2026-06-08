public class Kadane {
    public static void main(String[] arg){
        int[] arr = {-3,-2,-3};
        int currSum = 0;
        int maxSum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            currSum = currSum + arr[i];
            maxSum = Math.max(currSum,maxSum);

            if(currSum <= 0){
                currSum = 0;
            }
            
        }
        System.out.println(maxSum);
    }
}
