public class Swap {
    public static void main(String[] args) {

        //With Third Variable
        int a = 14;
        int b = 7;
        int c ;
        
        c = b -a;
        a = a + c;
        b = b - c;
        System.out.println("a: "+a);
        System.out.println("b: "+b);


        // Without thirnum2 variable
        int num1 = 10;
        int num2 = 3;

        num1 =num1+num2;    //num1 = 13
        num2= num1-num2;    //num2 = 10
        num1 = num1-num2;   //num1 = 3
        System.out.println(num1);
        System.out.println(num2);
    }
}
