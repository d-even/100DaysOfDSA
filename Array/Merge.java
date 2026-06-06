import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] nums1 ={2,4,1,7};
        int[] nums2 ={8,9,4,0};
        int a = nums1.length;
        int b = nums2.length;
        int[] res = new int[nums1 + nums2];

        System.out.println(Arrays.toString(res));

    }
}
