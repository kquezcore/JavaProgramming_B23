package Day20_Loops;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String sentence= "Java Java,Java Java, Java Java";
        int count =0;
        /*// java
        String str1= sentence.substring(0,4);
        String str2= sentence.substring(1, 5);
        String str3= sentence.substring(2, 6);
        String str4= sentence.substring(3, 7);
        */

        for (int i = 0; i <= sentence.length()-4 ; i++) {//
            String each = sentence.substring(i, i + 4);// representing each
            // four characters in sentence

            if (each.equals("Java")){
                count++;
        }
        }
        System.out.println(count);
        }
    }

/*
2. write a program that can return the frequency 
of the a word Java from the sentence 

        Ex:
            sentence = "Java Java";
           
            output:
                2
 */