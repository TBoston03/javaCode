
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboardEntry = new Scanner(System.in);
        System.out.print("Enter a word:");
        String entry = keyboardEntry.nextLine();
        String[][] encrypt = {entry.substring(0, (entry.length()/2)).split(""), entry.substring(entry.length()/2).split("")};
        String encryption = "";
        for(int r = 0; r <= encrypt.length-1; r++){
            for(int c = 0; c <= encrypt[r].length-1; c++){
               System.out.print(encrypt[c][r]);
            }
        }
     
        System.out.println(encryption);
        
        keyboardEntry.close();
        }    
        
    }

