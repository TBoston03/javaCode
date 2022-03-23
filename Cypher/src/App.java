
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboardEntry = new Scanner(System.in);
        System.out.print("Enter a word:");
        String entry = keyboardEntry.nextLine();
        String[][] generictop = {entry.split("", 3)};
        for(int i = 0; i <= generictop.length; i ++){
            System.out.println(generictop[0][i]);
        }
        keyboardEntry.close();
        }    
        
    }





    
/*String select = generic[i][h];
                System.out.print(select + " ");for(int g = 0; g < entry.length(); g++){
          for(int i = 0; i < generic.length; i ++){
            System.out.print("");
            for(int h = 0; h < generic[i].length; h ++){
               System.out.print(generic[i][h]);
            }
        }  */