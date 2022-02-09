import java.util.Scanner;

public class MadLib{
    public static void main(String[] args){
        //Getting the code ready to listen for keyboard input.
        Scanner keyboardInput = new Scanner(System.in);
        String finalTemplate = "";
        
        /**
         * I want to change "I" in the sentence below.
         * I can use substring to get a new string and replace word by word.
         *  */  
        /**
         * Sentence after I:
         * Make sure you include the whitespace in the substring
         *  */ 
        String firstReplacement = "The ";
        String secondReplacement = " of the ";
        String thirdReplacement = " is ";
        String fourthReplacement = " on all ";
        String fifthReplacement = " by the ";
        String sixthReplacement = " of the ";
        String seventhReplacement = " and the ";
        String eigthReplacement = " of ";
        String ninthReplacement = " Belessed is ";
        String tenthReplacement = ".";
        
        //print statement to ask user for specific input and Asking/Storing keyboard input
        System.out.print("Please enter a type of road:");
        String myInput1 = keyboardInput.nextLine();
        System.out.print("Please enter a proper noun:");
        String myInput2 = keyboardInput.nextLine();
        System.out.print("Please enter a past tense verb:");
        String myInput3 = keyboardInput.nextLine();
        System.out.print("Please enter a noun:");
        String myInput4 = keyboardInput.nextLine();
        System.out.print("Please enter a plural abstract noun:");
        String myInput5 = keyboardInput.nextLine();
        System.out.print("Please enter a singular noun:");
        String myInput6 = keyboardInput.nextLine();
        System.out.print("Please enter an plural abstract noun:");
        String myInput7 = keyboardInput.nextLine();
        System.out.print("Please enter a adjective:");
        String myInput8 = keyboardInput.nextLine();
        System.out.print("Please enter an noun:");
        String myInput9 = keyboardInput.nextLine();
        System.out.print("Please enter a pronoun:");
        String myInput10 = keyboardInput.nextLine();
        /**
         * Concatenating my keyboard input and the rest of my sentence +
         * Concatenating it all into my finalTemplate Variable that I will output
         * at the end to show my altered quote
         */
        finalTemplate = firstReplacement + myInput1 + secondReplacement + myInput2 + thirdReplacement + myInput3 + fourthReplacement + myInput4 + fifthReplacement + myInput5 + sixthReplacement + myInput6 + seventhReplacement + myInput7 + eigthReplacement + myInput8 + " " + myInput9 + tenthReplacement + ninthReplacement + myInput10 + tenthReplacement;

        //Outputting my altered quote
        System.out.print(finalTemplate);
        keyboardInput.close();
    }

}