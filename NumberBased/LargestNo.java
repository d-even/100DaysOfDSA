// public class LargestNo {
//     public static void main(String[] args) {
//         int[] arr = {78,87,4};

//         int max = arr[0];

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
                
//             }
            
//         }
//         System.out.println("Largest umber is: "+ max );
//     }
// }

public class LargestNo{
    public static void main(String[] args) {
        int a = 9;
        int b = 14;
        int c = 8;

        if (a>b && a> c) {
            System.out.println("A");
        }
        else if(b>c) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }
}
