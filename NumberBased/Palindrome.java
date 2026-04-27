public class Palindrome {
    public static void main(String[] args) {
        int num = 212;
        int orignal = num;
        int reverse = 0;

        while(num > 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        if(orignal == reverse){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
