package zulpikarsTasks1;

public class Q7String_PasswordValidationTask1 {

    public static void main(String[] args) {


        System.out.println(isPasswordValid("Password@"));


    }
    public static boolean isPasswordValid(String password) {
        boolean hasCorrectLength = password.length() >= 6;
        boolean hasNoSpace = !password.contains(" ");
        if (hasCorrectLength && hasNoSpace) {
            boolean digitFound = false;
            boolean upperCaseFound = false;
            boolean lowerCaseFound = false;
            boolean specialCharacter = false;
            for (char c : password.toCharArray()) {
                if (Character.isDigit(c)) {
                    digitFound = true;
                }
                if (Character.isUpperCase(c)) {
                    upperCaseFound = true;
                }
                if (Character.isLowerCase(c)) {
                    lowerCaseFound = true;
                }
                if (!Character.isLetterOrDigit(c)) {
                    specialCharacter = true;
                }
            }
            return digitFound && upperCaseFound && lowerCaseFound && specialCharacter;
        }
        return false;
    }

}
/*
write a return method that can verify if a password is valid or not

requirements:

1- password MUST be at least 6 chars and should not contain space
2- password should at least contain one upper case letter
3- password should at least contain one lower case letter
4- password should at least contain one special char
5- password should at least contain a digit if all requirements above are met,
 the method returns true, other ise returns false.

 */