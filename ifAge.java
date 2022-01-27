public class ifAge {
    public static void main (String[]args){
        int age = 19;
        if(age >= 21){
            System.out.println("You are old enough to drink alcohol and vote");
        }
        else if(age >= 18){
            System.out.println("You can vote but not drink");
        }
        else{
            System.out.println("You cannot drink yet");
        }
    }
}
