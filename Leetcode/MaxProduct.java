public class MaxProduct{
    public static void main(String[] args){
        int n = 123;
        int first = 0;
        int second = 0;

    

        while (n > 0) {
            int digit = n%10;
            if(digit > first){
                second = first;
                first = digit;
            }
            else if(digit > second){
                second = digit;
            }
            
             n /= 10;
            
            //   System.out.println(digit);
        }
        int ans = first * second;
        System.out.println(ans);
      
    }
}