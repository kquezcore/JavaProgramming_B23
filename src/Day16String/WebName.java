package Day16String;

public class WebName {


    public static void main(String[] args) {
        String url = "www.amazon.com";

        int beginning =  url.indexOf(".")+1;
        int end = url.lastIndexOf(".");

        String name = url.substring(beginning, end);
        String domain= url.substring(end +1);


        System.out.println(name);
        System.out.println( domain);




    }
}
