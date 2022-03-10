public class reverseString{
    public static void main(String[] args){
        String Reverse = "banana";
        String End = "";
        for (int i = Reverse.length(); i > 0; i--){
             End += Reverse.substring(i-1 , i );
        }
        System.out.print(End);


    }
}