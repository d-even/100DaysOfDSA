public class SumOfPrimeReverse {
    public static void main(String[] args) {
        int n = 13;
        int rev = 0;
        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        System.out.println(rev);
        // prime
        int sum = 0;
        while (rev >= n) {
            for (int i = 0; i < rev; i++) {
                if(rev % i == 0){
                    sum = sum + i;
                }
                
        }

    }
    System.out.println(sum);
}
}