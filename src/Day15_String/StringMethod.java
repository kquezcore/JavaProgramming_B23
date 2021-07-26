package Day15_String;

public class StringMethod {
    public static void main(String[] args) {


        String str = "Muhtar";
        char ch = str.charAt(0);
        System.out.println("ch = " + ch);


        System.out.println("-------------------");

        String schoolName = "     Cybertek school";

        schoolName= schoolName.trim();
        System.out.println(schoolName);
    }

}
