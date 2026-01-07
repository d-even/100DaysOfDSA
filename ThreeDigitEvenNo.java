// This is ThreeDigitEven Number 
// program to find the count of unique three-digit even numbers
// that can be formed using the given digits array.
// Approch : Nested loop 
// i will be at 100 place,j will be at 10 place and k will be at units place 
// Rules :
// 1. i,j,k should be different i!=j,i!=k,j!=k
// 2. k should be even number k%2 == 0
// 3. i should not be zero i != 0


import java.util.HashSet;
public class ThreeDigitEvenNo {
    
    public static void main(String[] args) {
        int[] digits = {1, 2, 3, 4};

        HashSet<Integer> map = new HashSet<>();
        int n = digits.length;

        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {

                    if (i != j && j != k && i != k && digits[k] % 2 == 0 && digits[i] != 0) {
                        int number = digits[i] * 100 + digits[j] * 10 + digits[k];
                        map.add(number);
                    }
                }
            }
            
        }
        
        System.out.println("The count of unique three-digit even numbers is: " + map.size());
    }
}