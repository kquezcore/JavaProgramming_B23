package Day16String;

public class StringMethods {
    public static void main(String[] args) {

        String email = "Cybertek@yahoo.com";
        email=email.replace("yahoo", "gmail");

        System.out.println(email);


        String sentence = "C# is cool, C# is fun";

       sentence=sentence.replaceFirst("C#", "Java");
        System.out.println(sentence);

        String s = "Cat Dog Cat Dog Cat";
       s= s.replaceFirst("Cat", "Dog");
        System.out.println(s);
    }
}
