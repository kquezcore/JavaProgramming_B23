package Day16String;

public class EmailDomain {
    public static void main(String[] args) {

        String email = "Cybertek@gmail.com";

        int beginningIndex = email.indexOf("@")+1;
        String domain = email.substring(beginningIndex);
        System.out.println("domain = " + domain);
    }
}
