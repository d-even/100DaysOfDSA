public class FindMultipleOfFirstLast{
    public static void main(String[] args) {
        int[] arr = {2,4,5,8,2,9,90,10,4};

        int first = -1, last = -1 ; 

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0) {
                if (first == -1)
                first = i; // first occurrence
                last = i;  // keeps updating
            }
        }

        System.out.println("First multiple of 5: index " + first + " = " + arr[first]);
        System.out.println("Last  multiple of 5: index " + last  + " = " + arr[last]);
    }
}