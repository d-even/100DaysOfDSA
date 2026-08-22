public class Aug6{
    public static void main(String[] args) {
        int n = 10;
        int k = 2;
        int num = n;
        int product = 1;

        while (n != 0) {
            product *= num % 10;
            num /= 10; 
        }
        System.out.println(num);
        
    }
}