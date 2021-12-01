package zulpikarsTasks1;

public class Q5String_Reverse{


    public static void main(String[] args) {

        String words= "abcd";

        System.out.println(reverse(words));

    }

    public static String reverse(String str){
        String word="";

        for (int i = str.length()-1; i>=0 ; i--) {
            if (str.charAt(i) == str.length() - 1){
                i--;
        }
        word +=  str.charAt(i);

        }
        return word;

    }
}
//Write a return method that can reverse a string
// ex: reverse("abcd)== dcba