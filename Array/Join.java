public class Join{
    public static void main(String[] args) {
       int[] arr = {2,5,7,9,10};
       int target = 9;
       int left = 0;
       int right = arr.length -1;
int mid = left + (right - left )/2;
     while(left <= right){
           

           if(arr[mid] == target){
            System.out.println(arr[mid]);
           }
           if(arr[mid] < target){
            left++;
           }
           else{
            right++;
           }
           
           
       }
       System.out.println(arr[mid]);
       
        
    }
}