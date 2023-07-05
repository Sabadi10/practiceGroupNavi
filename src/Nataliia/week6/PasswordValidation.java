package Nataliia.week6;

/*
  1) String - Password Validation Task
Write a return method that can verify if a password is valid or not. Requirements:
 1. Password MUST be at least 6 characters and should not contain space
 2. Password should at least contain one upper case letter
 3. Password should at least contain one lowercase letter
 4. Password should at least contain one special characters
 5. Password should at least contain a digit
If all requirements above are met, the method returns true, otherwise returns false
 */

public class PasswordValidation {

    public static void passwordValidation(String password){

        // 1. Password MUST be at least 6 characters and should not contain space
        if (password.length() < 6 || password.contains(" ")){
            System.err.println("Password MUST have at least 6 characters and should not contain spaces!");
            System.exit(1);
        }

        // 2. Password should at least contain one upper case letter
        boolean hasUpperCase = false;
        for (char eachCharacter : password.toCharArray()) {
            if (Character.isUpperCase(eachCharacter)){
                hasUpperCase = true;
                break;
            }
        }
        if (!hasUpperCase){
            System.err.println("Password MUST contain at least one upper case letter!");
            System.exit(1);
        }

        // 3. Password should at least contain one lowercase letter
        boolean hasLowerCase = false;
        for (char eachCharacter : password.toCharArray()) {
            if (Character.isLowerCase(eachCharacter)){
                hasLowerCase = true;
                break;
            }
        }
        if (!hasLowerCase){
            System.err.println("Password MUST contain at least one lower case letter!");
            System.exit(1);
        }

        // 4. Password should at least contain one special characters
        boolean hasSpecialChar = false;
        for (char eachCharacter : password.toCharArray()) {
            if (!Character.isLetterOrDigit(eachCharacter)) {
                hasSpecialChar = true;
                break;
            }
        }
        if (!hasSpecialChar) {
            System.err.println("Password MUST contain at least one special characters!");
            System.exit(1);
        }

        // 5. Password should at least contain a digit
        boolean hasDigit = false;
        for (char eachCharacter : password.toCharArray()) {
            if (Character.isDigit(eachCharacter)) {
                hasDigit = true;
                break;
            }
        }
        if (!hasDigit) {
            System.err.println("Password should at least contain a digit");
            System.exit(1);
        }

        // 6. if all requirements above are met, the method returns true, otherwise returns false
        System.out.println("The password met all requirements! ");
    }

    public static void main(String[] args) {
       passwordValidation("4431s99Z#");
    }

}
