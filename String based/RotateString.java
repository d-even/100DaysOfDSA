public class RotateString{
       public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";

       if(s.length() == goal.length()){
            String update = s + s;
            System.out.println(update.contains(goal));
       }
       else{
        System.out.println("false");
       }
    }
}