import java.util.Random;
import java.util.Scanner;

public class Passwordgenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Character pools
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String digits    = "0123456789";
        String symbols   = "!@#$%^&*()-_=+[]{}|;:,.<>?";

        System.out.println("=====================================");
        System.out.println("      Random Password Generator      ");
        System.out.println("=====================================");
        System.out.print("Enter desired password length (min 8): ");
        int length = scanner.nextInt();

        if (length < 8) {
            System.out.println("Password length too short. Setting to 8.");
            length = 8;
        }

        // Build full character pool
        String allChars = uppercase + lowercase + digits + symbols;

        // Guarantee at least one of each type
        StringBuilder password = new StringBuilder();
        password.append(uppercase.charAt(random.nextInt(uppercase.length())));
        password.append(lowercase.charAt(random.nextInt(lowercase.length())));
        password.append(digits.charAt(random.nextInt(digits.length())));
        password.append(symbols.charAt(random.nextInt(symbols.length())));

        // Fill remaining length with random characters
        for (int i = 4; i < length; i++) {
            password.append(allChars.charAt(random.nextInt(allChars.length())));
        }

        // Shuffle the password characters for randomness
        char[] pwArray = password.toString().toCharArray();
        for (int i = pwArray.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            char temp = pwArray[i];
            pwArray[i] = pwArray[j];
            pwArray[j] = temp;
        }

        String finalPassword = new String(pwArray);

        System.out.println("\n-------------------------------------");
        System.out.println("Generated Password: " + finalPassword);
        System.out.println("Password Length   : " + finalPassword.length());
        System.out.println("-------------------------------------");
        System.out.println("Your password contains:");
        System.out.println("  Uppercase letters, Lowercase letters");
        System.out.println("  Numbers, Special characters");
        System.out.println("=====================================");

        scanner.close();
    }
}