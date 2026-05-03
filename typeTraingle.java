public class typeTraingle{
    public static void main(String[] args){
       
       int[] arr = {3,3,3};
       int side1 = arr[0];
       int side2 = arr[1];
       int side3 = arr[2];

       if (arr.length == 4) {
        System.out.println("none");
       } 
       else{
        if (side1 == side2 && side2 == side3 && side1 == side3) {
        System.out.println("Equilateral ");
       }
       else if (side1 == side2 || side2 == side3 || side1 == side3) {
           System.out.println("Isoseclence");
       }
       else{
        System.out.println("Scalene");
       }
       }
    }
}