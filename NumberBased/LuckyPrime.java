import java.util.Scanner;

public class LuckyPrime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int res = num1 + num2;
        int result = 0;

        while(res != 0){
            int digit = res % 10;
            result = result + digit;
            res = res / 10;
        }

        boolean isPrime = true;

        if(result <= 1){
            isPrime = false;
        }
        for (int i = 2; i < result; i++) {
            if(result % i == 0){
                isPrime = false;
            }
        }
        if(isPrime){
            System.out.println("Lucky number"+ result);
        }
        else{
            System.out.println("Not Luck");
        }
    }
}