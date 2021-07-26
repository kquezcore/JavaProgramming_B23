package Day11_switch;

public class SwitchStatement2 {

    public static void main(String[] args) {

        String name = "Cybertek";

        if(name == "chrome");
        switch ( name){

            case "chrome":
                System.out.println("Chrome is selected");
                break;// case closed

            case "firefox":
                System.out.println("Firefox Browser is selected");
                break;// case closed
            case "edge":
                System.out.println("Edge Browser is selected");
                break;//Case closed

            default:
                System.err.println("Invalid Browser Name");// default does not need to be at the end
                // and does not finish the sentence
        }
    }
}
