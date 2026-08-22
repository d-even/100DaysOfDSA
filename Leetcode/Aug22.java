class Aug22{
    public static void main(String[] args) {
        int num = 99;
        int num1 = num;
        int sum = 0;
        int prod = 1;
        
        while(num > 0){
            int digit = num % 10;
            sum = sum + digit;
            prod = prod * digit;
            num = num / 10;
            
        }
        System.out.println(sum);
        System.out.println(prod);

        
        if(sum + prod == num1){
            System.out.println("true");
        }
        
    }
}