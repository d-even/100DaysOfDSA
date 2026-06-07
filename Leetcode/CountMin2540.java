public class CountMin2540 {

    public static void main(String[] args) {
        int[] nums1 ={1,2,3,6};
        int[] nums2 ={2,3,4,5,6};

        int i = 0;
        int j = 0;

        while(i<nums1.length && j<nums2.length){

            if(nums1[i] == nums2[j]){
                
                break;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
            else{
                j++;
            }

    }
    System.out.println(nums1[i]);
}
       
}
