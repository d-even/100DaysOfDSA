public class Inverted {
    public static void main(String[] args) {
        
        int n = 4; 

        // Outer loop i to n 
        for (int i = 1; i <= n; i++) {

        // Inner Loop j to [n - i + 1]
        for (int j = 1; j <= n-i+1 ; j++) {
            System.out.print("* ");
        }
        System.out.println();
        }

    }
}
