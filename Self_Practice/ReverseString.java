public class ReverseString {

    public static void main(String[] args) {

        String name = "jhonny";
        ReverseString reverseString = new ReverseString();

        System.out.println(reverseString.reverse(name));
    }

    public String reverse(String str) {
        String word = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i)== 'y') {
                i--;
            }
            word +=  str.charAt(i);

        }
        return word;
    }
}