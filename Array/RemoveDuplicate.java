public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,3,4,6,8,8};

        int i = 0;
        
        for (int j = 0; j < arr.length - 1; j++) {
                if(arr[j] != arr[i]){
                    i++;
                    arr[i] = arr[j];
                }
        }
        int res = i+1;
        System.out.println(res);
    }
}
