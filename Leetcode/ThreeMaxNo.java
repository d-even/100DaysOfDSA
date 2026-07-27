// public class ThreeMaxNo{
//     public static void main(String[] args) {
//         int num  = 24579;
//         int first = 0;
//         int second = 0;
//         int third  = 0;
        
//         while (num > 0) {
//             int digit = num % 10;
//             if(digit > first){
//                 third = second;
//                 second = first;
//                 first = digit;
//             }
//             else if(digit > second){
//                 third = second;
//                 second = digit;
//             }
//             else if(digit > third){
//                 third = digit;
//             }
//             num /= 10; 
//         }
//         System.out.println(first * second * third);
//     }
// }

public class ThreeMaxNo{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int first = arr[arr.length - 1] ;
        int second = arr[arr.length - 2] ;
        int third = arr[arr.length - 3] ;
        System.out.println(first *second*third);
    }
    
}