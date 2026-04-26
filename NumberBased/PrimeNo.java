public class PrimeNo {
    public static void main(String[] args) {
    
        int n = 8;
        boolean isPrime = true;

        if(n <= 1){
            isPrime = false;
        }
        else{
            for (int i = 2; i < n; i++) {
                if(n % i == 0){
                    isPrime = false;
                }
            }
        }
        if (isPrime) {
            System.out.println("Prime No detected");
        }
        else{
            System.out.println("Not a prime number");
        }
    }
}
