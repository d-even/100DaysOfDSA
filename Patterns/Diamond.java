public class Diamond{
    public static void main(String[] args) {
        
        int n = 4;
        
        // Upper Normal Pyramid
        for (int i = 1; i <= n; i++) {
            
            // Spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // Star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // Lower Inverted Pyramid
        for (int i = n-1; i >= 1; i--) {
            
            // Spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // Star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}