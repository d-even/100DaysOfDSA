public class Count {
    public static void main(String[] args) {
        
        int num = 0;
        int count = 0;

        if(num == 0){
            count++;
        }

        while(num > 0){
            num = num / 10;
            count++;
        }
        System.out.println(count);
    }
}
