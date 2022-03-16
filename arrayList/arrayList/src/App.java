import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboardInput = new Scanner(System.in);
        String entry = keyboardInput.nextLine();
        String[][] genericArray = new String[entry.length() / 3][3];

        for(int i = 0; i < genericArray.length - 1; i ++){
            for(int h = 0; h < genericArray[i].length - 1; h ++){
                System.out.print(genericArray[h][i]);
            }
        }
        




        /*for(int i = 0; i < helloWord.length; i ++){
            System.out.println("");
            for(int h = 0; h < helloWord[i].length; h ++){
                int select = helloWord[h][i];
                System.out.print(select + " ");
            }
        }*/
    }
}
