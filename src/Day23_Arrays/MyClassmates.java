package Day23_Arrays;

public class MyClassmates {

    public static void main(String[] args) {


        // if we already know the elements are
        String[]friends = { "Sabit", "Ahmet", "Tugba","Sabit", "Ahmet"};
        System.out.println("Size: "+friends.length);

        for (int i=0; i<= friends.length-1;i++){
            System.out.println(friends[i] );
        }

        System.out.println("------------------------------------------");


        //if we don't know what are the elements but we
        // Do know how many elements we wanna store

        String[]friends2 = new String[5];
        System.out.println("Size: "+friends2.length);


        // to replace the element form empty or null with a name

        friends2[0]="Kemal";
        friends2[1]="Kamal";
        friends2[2]="Kimal";
        friends2[3]="Komal";
        friends2[4]="Kumal";



        // friends2[0] means that the number replacing 0
        // is based on the amount of empty variables

        //otherwise

        for (int i = 0; i <= friends2.length-1; i++) {
            System.out.println(friends2[i]);

        }

    }
}
