package weeklyQuestionsEmir.Week06;
/*

This a return method that can verify if a password is valid or not. Requirements:
 1. Password MUST be at least 6 characters and should not contain space
Password should at least contain one upper case letter
Password should at least contain one lowercase letter
Password should at least contain one special characters
Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false
 */
public class PasswordValidation {
    public static boolean validPassword(String password) {
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialCharacter = false;
        boolean hasDigit = false;
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if ( Character.isDigit(ch)){
                hasDigit=true;
            } else if (!(Character.isUpperCase(ch)&& Character.isLowerCase(ch)|| Character.isDigit(ch) )){
                hasSpecialCharacter=true;
            }

        }
        return hasUpperCase && hasLowerCase && hasSpecialCharacter && hasDigit;
    }
   /* public static boolean isSpecialCharacter(char ch){
        String specialCharacters = "!@#$%^&*()_+{}:\"<>?|[];',./~`";
        // Check if the given character is a special character
        return specialCharacters.contains(String.valueOf(ch));
    }

    */

    public static void main(String[] args) {
        System.out.println(validPassword("Abcd?fhi3"));
    }

}

