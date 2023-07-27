package week6;

import static java.lang.Character.isSpaceChar;
/*
String - Password Validation Task
Write a return method that can verify if a password is valid or not.
Requirements:
Password MUST be at least 6 characters and should not contain space
Password should at least contain one upper case letter
Password should at least contain one lowercase letter
Password should at least contain one special characters
Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false
 */
public class PasswordValidation {

    public static boolean PasswordValidation(String password) {
        if (password.length() < 6 || password.contains(" ")) {
            System.err.println("Password must be at least 6 characters and should not contain space");
            System.exit(1);
        }
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecChar = false;
        boolean hasDigit = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isSpaceChar(c)) {
                hasSpecChar = true;
            } else if (Character.isDigit(c)){
                hasDigit = true;
            }
        }
        return hasUpperCase && hasLowerCase && hasSpecChar && hasDigit;
    }
    public static void main(String[] args) {
        System.out.println(PasswordValidation("Sdm@#!!!47862"));
    }
}

