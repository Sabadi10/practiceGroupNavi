package Larbi.week6;

public class PasswordValidation {


    public static void main(String[] args) {
        String password = "Password123!"; // Example password
        System.out.println(isValidPassword(password)); // Output: true
    }



    public static boolean isValidPassword(String password) {
        // Requirement 1: Password must be at least 6 characters and should not contain space

        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        // Requirement 2: Password should contain at least one uppercase letter
        boolean hasUpperCase = false;
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
                break;
            }
        }
        if (!hasUpperCase) {
            return false;
        }

        // Requirement 3: Password should contain at least one lowercase letter
        boolean hasLowerCase = false;
        for (char ch : password.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
                break;
            }
        }
        if (!hasLowerCase) {
            return false;
        }

        // Requirement 4: Password should contain at least one special character
        boolean hasSpecialChar = false;
        String specialChars = "~`!@#$%^&*()-_=+\\|[{]};:'\",<.>/?";
        for (char ch : password.toCharArray()) {
            if (specialChars.contains(String.valueOf(ch))) {
                hasSpecialChar = true;
                break;
            }
        }
        if (!hasSpecialChar) {
            return false;
        }

        // Requirement 5: Password should contain at least one digit
        boolean hasDigit = false;
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                hasDigit = true;
                break;
            }
        }
        if (!hasDigit) {
            return false;
        }

        // All requirements are met
        return true;
    }

}
