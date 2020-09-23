import java.util.Scanner;

public class Caesar {
    public static String encryptCaesar(String message) {
        String result = "";
        
        for (int i = 0; i < message.length(); i ++){
            if(message.charAt(i)>96&&message.charAt(i)<123)
                result += (char)((message.charAt(i)-97+3)%26+97);
            else if(message.charAt(i)>64&&message.charAt(i)<91)
                result += (char)((message.charAt(i)-65+3)%26+65);
            else
                result += (char)(message.charAt(i));
        }
        return result;
    }

    public static String decryptCaesar(String message) {
        String result = "";
        
        for (int i = 0; i < message.length(); i ++){
            if(message.charAt(i)>99&&message.charAt(i)<123)
                result += (char)((message.charAt(i)-97-3)%26+97);
            else if(message.charAt(i)>67&&message.charAt(i)<91)
                result += (char)((message.charAt(i)-65-3)%26+65);
            else if(message.charAt(i)>64&&message.charAt(i)<68)
                result += (char)((message.charAt(i)-65+26-3)%26+65);
            else if(message.charAt(i)>96&&message.charAt(i)<100)
                result += (char)((message.charAt(i)-97+26-3)%26+97);
            else
                result += (char)(message.charAt(i));
        }
        return result;
    }

    public static String encryptCaesarKey(String message, int key) {
        String result = "";
        
        for (int i = 0; i < message.length(); i ++){
            if(message.charAt(i)>96&&message.charAt(i)<123)
                result += (char)((message.charAt(i)-97+key)%26+97);
            else if(message.charAt(i)>64&&message.charAt(i)<91)
                result += (char)((message.charAt(i)-65+key)%26+65);
            else
                result += (char)(message.charAt(i));
        }
        return result;
    }

    public static String decryptCaesarKey(String message, int key) {
        String result = "";
        
        for (int i = 0; i < message.length(); i ++){
            if(message.charAt(i)>(96+key%26)&&message.charAt(i)<123)
                result += (char)((message.charAt(i)-97-(key%26))%26+97);
            else if(message.charAt(i)>(64+key%26)&&message.charAt(i)<91)
                result += (char)((message.charAt(i)-65-(key%26))%26+65);
            else if(message.charAt(i)>64&&message.charAt(i)<(65+key%26))
                result += (char)((message.charAt(i)-65+26-(key%26))%26+65);
            else if(message.charAt(i)>96&&message.charAt(i)<(97+key%26))
                result += (char)((message.charAt(i)-97+26-(key%26))%26+97);
            else
                result += (char)(message.charAt(i));
        }
        return result;

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to 'encrypt' or 'encrypt' a message?");
        String command = scan.nextLine().trim().toLowerCase();

        if (command.equals("encrypt")) {
            System.out.println("Please enter your message to be encrypted: ");
            String message = scan.nextLine();
            System.out.println("Here is your encrypted message: ");
            System.out.println(encryptCaesar(message));
        }
        else if (command.equals("decrypt")) {
            System.out.println("Please enter your message to be decrypted: ");
            String message = scan.nextLine();
            System.out.println("Here is your decrypted message: ");
            System.out.println(decryptCaesar(message));
        }
        else {
            System.out.println("Unknown command; please type either 'encrypt' or 'decrypt'");
        }

        scan.close();
    }
}
