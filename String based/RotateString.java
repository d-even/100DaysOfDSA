public class RotateString{
       public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";

       if(s.length() == goal.length()){
            String updatedString = s + s;
            System.out.println(updatedString);
            System.out.println(updatedString.contains(goal));
       }
       else{
        System.out.println("false");
       }
       
    }
}