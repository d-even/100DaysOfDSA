public class PalindromeString {
    public static void main(String[] arg){
        String str = "MADAM";

        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length -1;

        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        left++;
        right--;

        String rev = reverse(arr);

    }
}
