public class ReverseArr {

    public static String reverse(String str, int k) {
        char[] arr = str.toCharArray();

        int left = 0;
        int right = k - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        
        String str = "HELLO";
        int k = 2;
        String rev = reverse(str,k);
        System.out.println(rev);
    }
}
