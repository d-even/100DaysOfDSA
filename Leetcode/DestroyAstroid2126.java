import java.util.Arrays;

public class DestroyAstroid2126 {
    public static void main(String[] args) {

        int[] arr = {4, 9, 23, 4};
        int sum = 5;

        Arrays.sort(arr);

        boolean canDestroy = true;

        for (int i = 0; i < arr.length; i++) {

            if (sum >= arr[i]) {
                sum += arr[i];
            } else {
                canDestroy = false;
              
            }
        }

        System.out.println(canDestroy);
    }
}