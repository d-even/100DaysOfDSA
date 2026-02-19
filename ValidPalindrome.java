public class ValidPalindrome{
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        int left = 0;
        int right = s.length()-1; 
        
        while(left < right){

            while(left < right && Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }

            while(left < right && Character.isLetterOrDigit(s.charAt(right))){
                right--;

                if(Character.toLowerCase(left) != Character.toLowerCase(right)){
                    System.out.println("Not Palindrome");
                }
                left++;
                right--;

            }
            System.out.println("Palindrome");;
        }
    }
}