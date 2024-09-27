import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String inputStr;
        String reversedStr = "";
        Scanner userInput = new Scanner(System.in);

        System.out.print("Input a string that you want to have reversed: ");
        inputStr = userInput.nextLine();
        userInput.close();

        for(int i = 0; i < inputStr.length(); i++){
            reversedStr = inputStr.charAt(i) + reversedStr;
        }

        System.out.println("\nThe reversed string is: " + reversedStr + "\n");
    }
}