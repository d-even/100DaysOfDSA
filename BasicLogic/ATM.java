
import java.util.Scanner;

class CheckBalance{
    public String check(int balance){
        return ("Hello");
    }
}
class Deposit{

}

class Withdraw{

}


public class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int option ;
        int balance = 1000;

        

        System.out.println("1: Check Balance");
        System.out.println("2: Deposit Cash");
        System.out.println("3: Withdraw Cash");
        System.out.println("4: Exit");

        System.out.println("Select Your choice");
        option = sc.nextInt();

        switch (option) {
            case 1:
                CheckBalance obj1 = new CheckBalance();
                System.out.println(balance);
                break;
            case 2:
                
                break;
            case 3:
                
                break;
        
            default:
                break;
        }
    }
}
