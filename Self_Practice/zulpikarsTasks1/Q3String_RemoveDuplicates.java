package zulpikarsTasks1;

public class Q3String_RemoveDuplicates {
    public static void main(String[] args) {
        String word= "aaabbbccc";

        Q3String_RemoveDuplicates removeDuplicates= new Q3String_RemoveDuplicates();
        System.out.println(removeDuplicates.removeDup(word));

    }

    public String removeDup(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (!result.contains("" + str.charAt(i))) {
                result += "" + str.charAt(i);
            }
        }

        return result;
    }

}
// write a return method that can remove the duplicated values from string
// ex: removeDup("aaabbbccc")== abc

