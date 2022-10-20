import java.util.Scanner;
public class PasswordValidation {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a Password: ");
        String password = input.next();
        if (Validation(password) == true) {
            System.out.println("Valid Password");
        } else
        {
            System.out.println("Invalid Password");
        }
    }

    public static boolean Validation(String password) {

        if (password.length() < 10) {
            return false;
        }
        char[] pass = password.toCharArray();
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isDigit(pass[i]) && !Character.isLetter(pass[i])) {
                return false;
            }
        }
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(pass[i])) {
                count++;
            }
        }
        if (count < 3) {
            return false;
        }
        return true;
    }

}





