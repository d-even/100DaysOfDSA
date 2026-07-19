
import java.util.Arrays;

public class Intersection{
    public static void main (String[] arg){
        int[] arr1 = {1,4,5,7,8};
        int[] arr2 = {1,7,8};
        int[] intersection = new int[arr1.length];
        int i = 0;
        int j = 0;
        
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] == arr2[j]){
                
                intersection[i] = arr1[i];
                i++;
                j++;
            }
            else if(arr1[i] < arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        System.out.println(Arrays.toString(intersection));
    }
}