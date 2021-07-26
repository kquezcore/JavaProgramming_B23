package Day27_Recap;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String str = "aaabccddefggggh";// b,e,f,h


        // IndexOf: will return 0 first index
        //LastIndex0f: will return last index

        for (char each:str.toCharArray()){// "Each" represents each character of str



            if (str.indexOf(each)==str.lastIndexOf(each)){// if the character first and ast index first and last index number in string are same, then the character is unique

                System.out.println(each);
                break;// the break statement will be the end
            }
        }
    }
}
