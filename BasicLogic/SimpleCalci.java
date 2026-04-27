
import java.util.Scanner;

class Calci{
    public int addition(int num1, int num2){
        int res = num1 + num2;
        return res;
    }

    public int subtraction(int num1, int num2){
        int res = num1 - num2;
        return res;
    }
    
}
class AdvaceCalc extends Calci{

    public int Multiplication(int num1 , int num2){
        int res = num1 * num2;
        return res;
    }


    public int Division(int num1 , int num2){
        int res = num1 / num2;
        return res;
    }
}

public class SimpleCalci{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        AdvaceCalc obj = new AdvaceCalc();
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
                result = obj.addition(num1, num2);
                System.out.println(result);
                break;

            case 2:
                result = obj.subtraction(num1, num2);
                System.out.println(result);
                break;

            case 3:
                result = obj.Multiplication(num1, num2);
                System.out.println(result);
                break;

            case 4:
                result = obj.Division(num1, num2);
                System.out.println(result);
                break;

            default:
                break;       
        }
    }
}