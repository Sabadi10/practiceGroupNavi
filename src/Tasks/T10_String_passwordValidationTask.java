package Tasks;

public class T10_String_passwordValidationTask {
    /* 1) String - Password Validation Task
Write a return method that can verify if a password is valid or not. Requirements:
1. Password MUST be at least 6 characters and should not contain space
-Password should at least contain one upper case letter
-Password should at least contain one lowercase letter
-Password should at least contain one special characters
-Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise return false
*/
    public static void main(String[] args) {

        String Password = "RANDOampassword12*/";
        Boolean hasdigit = false;
        boolean hasUpperCase = false;
        Boolean hasLowerCase = false;
        Boolean hasSpecialCharacters = false;
        Boolean isValidPassword = true;



            if (Password.length() >= 6 && !Password.contains(" ")) {
                for (int i = 0; i < Password.length(); i++) {

                    if (Character.isLetter(Password.charAt(i))) {
                        if (Character.isUpperCase(Password.charAt(i))) {
                            hasLowerCase = true;
                            break;
                        } else if (Character.isLowerCase(Password.charAt(i))) {
                            hasLowerCase = true;
                            break;
                        }
                    } else if (Character.isDigit(Password.charAt(i))) {
                        hasdigit = true;
                        break;
                    } else {
                        hasSpecialCharacters = true;
                        break;
                    }
                }

            } else {
                System.out.println("Password should be at least 6 characters and no spaces");
                System.exit(1);
            }

            if (!(hasdigit && hasLowerCase && hasUpperCase && hasSpecialCharacters)){
                isValidPassword = false;
            }
        System.out.println(isValidPassword);


    }
}
