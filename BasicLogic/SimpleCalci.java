
import java.util.Scanner;

public class SimpleCalci{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int option, num1 , num2, result;

        System.out.println("Enter Operation");
        System.out.println("1: Addition");
        System.out.println("2: Substraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
        System.out.println("5: Exit");
        
        option = sc.nextInt();
        System.out.println("Enter 1st Number");
        num1 = sc.nextInt();
        System.out.println("Enter 2st Number");
        num2 = sc.nextInt();

        switch (option) {
            case 1:
                result = num1 + num2;
                System.out.println(result);
                break;

            case 2:
                result = num1 - num2;
                System.out.println(result);
                break;

            case 3:
                result = num1 * num2;
                System.out.println(result);
                break;

            case 4:
                result = num1 / num2;
                System.out.println(result);
                break;

            default:
                break;
                
        }
        
    }
}