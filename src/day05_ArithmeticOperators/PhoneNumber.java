package day05_ArithmeticOperators;

public class PhoneNumber {

    public static void main(String[] args) {

        int countryCode = 45,
                areaCode= 405,
                localNumber= 123456;

        System.out.println("+"+countryCode+"("+areaCode+")"+"-"+localNumber);
    }
}
//countryCode, areaCode, localNumber
//
//            use string concatenation to display the phone number
//
//            ex:
//                if  countryCode = +1
//                    areaCode = 703
//                    localNumber = 4512625
//
//                output:
//                    +1(703)-4512625
// do not use char('') bc it will use the number from the acii table