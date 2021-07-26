package Day23_Arrays;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        String str = "aabccc";

        String removeDup = ""; //abc

        // STEP 1
        for (int i = 0; i <= str.length()-1 ; i++) {
            char ch = str.charAt(i);

            if(  removeDup.contains( ""+ch) ){ // if the character is already contained in removeDup
                continue; // skip it
            }

            removeDup += ch;
        }

        System.out.println(removeDup);


        String result = "";  //a2b1c3
        //a b c
        //2 1 3


        // STEP 3
        for (int j = 0; j <= removeDup.length()-1 ; j++) {//0,1,2   to get each
            // character from the string


            //STEP 2
            char ch = removeDup.charAt(j);//'a'
            int frequency =0;// for the frequencies of ch
        //2,1,3

            for (int i = 0; i <= str.length()-1; i++) {// inner loop responsible for returning frequency of ch
                char each = str.charAt(i);

                if (each == ch) {
                    frequency++;
                }
            }
            result+= ""+ch+frequency;
        }
        System.out.println( result);
    }


}

/*
2. find the frequency of each characters from a string
			str = "aabcccd";
			output:
				a2b1c3d1

				1- need to know how to remove duplicates.
				2 need to know how to find the frequency of one character
				3- use the loop and apply step 2 tot he remaining characters of the string
 */

