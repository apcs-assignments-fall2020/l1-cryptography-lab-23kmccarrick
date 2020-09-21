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
            if(message.charAt(i)>96&&message.charAt(i)<123)
                result += (char)((message.charAt(i)-97-3)%26+97);
            else if(message.charAt(i)>65&&message.charAt(i)<91)
                result += (char)((message.charAt(i)-65-3)%26+65);
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
        return message;
        // REPLACE THIS WITH YOUR CODE
    }


    public static void main(String[] args) {
        System.out.println(encryptCaesar("zebra x-rays"));
    }
}
