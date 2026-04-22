
import java.util.Scanner;


public class Star{
    public static void main(String[] args) {


Scanner sc = new Scanner(System.in);

System.out.println("Enter the number for Star-Pyramid");
int num = sc.nextInt();

for (int i = 1; i <= num; i++) {
    

    // For Spacing 
    for (int j = 1; j <= num - i; j++) {
        System.out.print(" ");
    }

    // For Star pattern
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }

    // Move this inside
    System.out.println();
}
    }
}