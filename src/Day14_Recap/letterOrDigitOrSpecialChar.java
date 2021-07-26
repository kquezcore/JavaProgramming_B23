package Day14_Recap;

public class letterOrDigitOrSpecialChar {

    public static void main(String[] args) {

        char ch= '0';
        boolean isDigit = ch >+48 && ch<=57;
        //if the character is in between 48-57

        boolean isLetter = (ch >= 65 &&ch <= 90)|| (ch >=97&& ch <= 122);
        // is the character is upper case letter or lower case letter.
/*
        String result = "";

        if (isDigit){
            result = ch+" Digit";
        }else if (isLetter){
            result =ch+ " Letter";
        }else{
            result =ch+" Special Character";
        }

        System.out.println(result);

 */
        String result = (isDigit)? ch+ " is digit":(isLetter)? ch+ " is letter": ch+ " is  special character";
        System.out.println(result);
    }
}
