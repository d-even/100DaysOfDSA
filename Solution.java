public class Solution {
    public static void main(String[] args) {
        int n = 234;
        int product = 1;
        int sum = 0;
        int diff = 0;

        while(n != 0){
            int digit = n % 10;
            product = product * digit;
            sum = sum + digit;
            n = n / 10;
        }
        diff = product - sum;
        System.out.println(diff);
        }
        
    
}
