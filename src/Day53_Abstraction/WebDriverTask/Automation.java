package Day53_Abstraction.WebDriverTask;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Automation {

    public static void main(String[] args) {

        // ***************Chrome Driver********************

        ChromeDriver driver =  new ChromeDriver();
        driver.get("www.google.com");
        driver.findElement("xpath");
        driver.getTitle();
        driver.close();
        driver.quit();


        System.out.println("----------------------------------------");

        // ***************Firefox Driver********************

        FirefoxDriver driver2 = new FirefoxDriver();
        driver.get("www.google.com");
        driver.findElement("xpath");
        driver.getTitle();
        driver.close();
        driver.quit();


        System.out.println("-----------------------------------------");

        // ***************Opera Driver********************

        OperaDriver driver3 = new OperaDriver();
        driver3.get("www.google.com");
        driver3.findElement("xpath");
        driver3.getTitle();
        driver3.close();
        driver3.quit();

        System.out.println("-----------------------------------------");

        // *************** Edge Driver********************

        EdgeDriver driver4 = new EdgeDriver();
        driver4.get("www.google.com");
        driver4.findElement("xpath");
        driver4.getTitle();
        driver4.close();
        driver4.quit();

        System.out.println("-----------------------------------------");
        // WebDriver driver5 = new WebDriver();
        //  driver3.get("www.google.com");

        WebDriver driver5 = new OperaDriver();
        driver5.get("www.amazon.com");

        System.out.println("--------------------------------------");

        WebDriver driver6 = getDriver("firefox");

        //   WebDriver driver7 = new ChromeDriver();


    }


    public static WebDriver getDriver(String name){

        switch (name){
            case "chrome":
                return new ChromeDriver();

            case "firefox":
                return new FirefoxDriver();

            default:
                throw new RuntimeException("Invalid Browser name");
        }
    }
}
