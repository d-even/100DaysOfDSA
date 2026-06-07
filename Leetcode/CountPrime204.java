public class CountPrime204 {
    public static void main(String[] arg){

        int n = 10;
        int count = 0;

        boolean[] composites = new boolean[n];

        if(n <= 1){
            System.out.println(count);
        }

        int limit = (int)Math.sqrt(n);
        for (int i = 2; i <= limit; i++) {
            composites[i] = false;
            
            for (int j = i * i; j < n; j+=i) {
                composites[j] = true; 
            }
        }
        

        for (int i = 2; i < n; i++) {
            if(composites[i] == false)
                count++;            
        }
        System.out.println(count);

        
    }   
}
