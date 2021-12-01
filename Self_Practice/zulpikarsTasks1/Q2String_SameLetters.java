package zulpikarsTasks1;

public class Q2String_SameLetters {
    public static void main(String[] args) {
       String name= "abc";
       String name2= "cab";


        System.out.println(sameLetters(name,name2));
    }

    public static boolean sameLetters(String word1, String word2){
        boolean result= true;

        if (word1.contains(word2)){
            result= true;
        }else{
            result = false;
        }
        return result;
            }
}
// Write Return method that check if a String us build out of the same letters as another string.
//ex: same("abc","cab"): == true
//ex: same("abc","abb"): == false