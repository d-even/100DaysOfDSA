import java.util.Arrays;

public class MinCost2144 {
    public static void main(String[] args) {
        int[] cost = {6,5,7,9,2,2};
        
        Arrays.sort(cost);
        int total = 0;

        for (int i = cost.length - 1; i >= 0; i-= 3) {
           total += cost[i];
            if(i % 3 != 2){
                total += cost[i -1];
                
            }
        }
        System.out.println(total);

    }
}
