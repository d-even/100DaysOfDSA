import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] nums1 ={1,2,3,6};
        int[] nums2 ={2,3,4,5};
       
        int a = nums1.length;
        int b = nums2.length;

        int c =  a + b;
        int[] res = new int[c];

        for (int i = 0; i < a; i++) {
            res[i] = nums1[i];
        }

        for (int i = 0; i < b; i++) {
            res[a + i] = nums2[i];
        }
        Arrays.sort(res);

        System.out.println(Arrays.toString(res));

    }
}
