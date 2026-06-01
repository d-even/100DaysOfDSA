public class GCD{
    public static void main (String[] arg){
        int n1 = 12;
        int n2 = 7;

        while(n1 % n2 != 0){
            int temp = n1 % n2;
            n1 = n2;
            n2 = temp;
        }
        int gcd = n2;

        // For Lcm we have formula 
        int a = n1;
        int b = n2;
        int lcm  = (a * b)/gcd;

        System.out.println(gcd);
        System.out.println(lcm);
    }
}