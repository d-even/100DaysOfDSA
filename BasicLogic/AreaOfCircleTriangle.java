import java.util.Scanner;

public class AreaOfCircleTriangle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int radius = sc.nextInt();

        int area ;

        area = (radius*radius * 22)/7;

    System.out.println("Area of Circle is : "+ area);


    }
}
