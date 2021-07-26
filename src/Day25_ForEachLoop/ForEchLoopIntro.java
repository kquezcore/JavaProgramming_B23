package Day25_ForEachLoop;

public class ForEchLoopIntro {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};


        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("-------------------------------------");


        for (int each:numbers ) {//each elements of the array
            System.out.println(each);
        }
        System.out.println("---------------------------------------------");


        String[] names ={"Ahmet", "boburbek","farid","robinson",};

        for (String eachName: names){
            System.out.println(eachName);
        }
    }
}
