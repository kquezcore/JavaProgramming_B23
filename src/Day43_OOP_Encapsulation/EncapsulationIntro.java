package Day43_OOP_Encapsulation;

public class EncapsulationIntro {
    private String  username="Cybertek",
                    password="Cybertek123";


    public String getUsername(){ return username; }// this is a getter, it allows us to read the private data, outside the class

    public String getPassword(){ return password; }

    public void setUsername(String username){
        if (username.length()<5){
            System.out.println("User name needs to be at least 5 characters long");
            return;
        }this.username= username; }

    public void setPassword(String password){
        if (password.length()<8){
            System.out.println("Password needs to be at least 8 characters long");
            return;
        }
        this.password=password; }




}
