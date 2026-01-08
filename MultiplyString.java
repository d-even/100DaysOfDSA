public class MultiplyString{
    public static void main(String[] args) {
        String num1 ="123";
        String num2 = "456";

        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int res = n1*n2;
        String result = Integer.toString(res);
        System.out.println(result);
    }
}