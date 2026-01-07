// Day 2
// Complexity : O(n^3)
// Approch : Brute Force
// Rules: i != j , j != k , i != k
//        First digit should not be zero
//        Last digit should be even (number 2% == 0)





import java.util.HashSet;

public class FindEvenNo{
    public static void main (String[]args){
        int digits[] = {1,2,2,3,4};
        HashSet<Integer> map = new HashSet<>();

        int n = digits.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (i != j && j != k && i != k && digits[i] != 0 ) {
                        int number = digits[i] * 100 + digits[j] * 10 + digits[k];
                        if (number % 2 == 0) {
                            map.add(number);
                        }
                    }
                }
            }
            
        }
        System.out.println("The even numbers formed are: " + map);

    }
}