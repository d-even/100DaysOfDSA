public class SortedRotated {
    public static void main(String[] args) {
        int[] nums = {2,1,3,4};
        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;
            }
        }

        // circular check
        if (nums[nums.length - 1] > nums[0]) {
            count++;
        }

        if (count > 1) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
}


// // public class SortedRotated {
//     public static void main(String[] args) {

//         int[] nums = {2,1,3,4};
//         int count = 0;
//         int n = nums.length;

//         for(int i = 0; i < n; i++){
//             if(nums[i] > nums[(i + 1) % n]){
//                 count++;
//             }
//         }

//         System.out.println(count <= 1);
//     }
// }