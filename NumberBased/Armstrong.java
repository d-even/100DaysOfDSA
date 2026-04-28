public class Armstrong {
    public static void main(String[] args) {
        
        int num = 153;
        int orignal = num;
        int result = 0;

        while(num != 0){
            int digit = num % 10;
            result += Math.pow(digit, 3);
            num = num / 10;
        }
        if(orignal == result ){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not an armstrong number");
        }
    }
}
