package Day15_String;

public class StringMethods2 {
    public static void main(String[] args) {
        String sentence = "Java programming Language";

        String name=  sentence. substring(0,3+1);
        System.out.println(name);

        String s2= "Cybertek School";
        String name2 =s2.substring(0, 8);
        System.out.println(name2);

        String name3 = s2.substring(9, 15);
        System.out.println(name3);
        System.out.println("______________________________________");

        String sentence2 = "Java is a programming language";

        String name4= sentence2.substring(10);

        System.out.println(name4);

        String name5= sentence2.substring(10,20+1);
        System.out.println(name5);
        System.out.println("------------------------------");


        String sentence3 = "Python is an easy language";
        sentence3= sentence3.replace("Python",  "Java");
        System.out.println(sentence3);


        System.out.println("---------------");

        String sentence4 = "C# is a programming language, i like learning C#, C# is the best";
       sentence4= sentence4.replace("C#","Java");

        System.out.println(sentence4);

        System.out.println("___________________________");

        String sentence5 = "Dog is friendly, Dog i Loyal, i love Dogs";
        sentence5=sentence5.replace("Dog", "Cat");

        System.out.println(sentence5);



    }





}
