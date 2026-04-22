import java.util.Scanner;

public class GymMembership{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Month");
        int n = sc.nextInt();

        if(n <= 0){
            System.out.println("Invalid Input");
        }
        else if (n == 1){
            System.out.println("First Slap");
        }
        else{
            System.out.println("15000");
        }
    }
}