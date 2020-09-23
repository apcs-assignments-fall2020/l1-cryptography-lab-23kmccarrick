import java.util.Scanner;

public class Vigenere {
    public static String encryptVigenere(String message, String key) {
        String boi = "";
        int dum = 0;
        for(int i = 0; i < message.length(); i++){
            if(message.charAt(i)>96&&message.charAt(i)<123)
                boi += (char)((message.charAt(i)-97+key.charAt(dum))%26+97);
            else if(message.charAt(i)>64&&message.charAt(i)<91)
                boi += (char)((message.charAt(i)-65+key.charAt(dum))%26+65);
            else
                boi += (char)(message.charAt(i));
            if(dum==key.length()-1)
                dum = 0;
            else
                dum ++;
        }
        return boi;
        // I spent 45 minutes doing this and finishing the caesar
    }

    public static String decryptVigenere(String message, String key) {
        return message;
        // REPLACE THIS WITH YOUR CODE
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to \"encrypt\" or \"decrypt\" a message?");
        String command = scan.nextLine().trim().toLowerCase();

        if (command.equals("encrypt")) {
            System.out.println("Please enter your message to be encrypted: ");
            String message = scan.nextLine();
            System.out.println("Please enter the key for your message: ");
            String key = scan.nextLine().trim().toUpperCase();
            System.out.println("Here is your encrypted message: ");
            System.out.println(encryptVigenere(message, key));
        }
        else if (command.equals("decrypt")) {
            System.out.println("Please enter your message to be decrypted: ");
            String message = scan.nextLine();
            System.out.println("Please enter the key for your message: ");
            String key = scan.nextLine().trim().toUpperCase();
            System.out.println("Here is your decrypted message: ");
            System.out.println(decryptVigenere(message, key));
        }
        else {
            System.out.println("Unknown command; please type either \"encrypt\" or \"decrypt\"");
        }

        scan.close();
    }
}
