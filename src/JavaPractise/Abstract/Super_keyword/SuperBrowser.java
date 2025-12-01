package JavaPractise.Abstract.Super_keyword;

import java.nio.channels.ClosedByInterruptException;

public class SuperBrowser {
    public static void main(String[] args) {
        baseBrowser b1 = new baseBrowser();
        String browser = b1.getBrowser();
        System.out.println(browser);
        b1.setBrowser("comet");
        System.out.println(b1.getBrowser());
        b1.closeBrowser();
        System.out.println("------------------------------Manually calling----------------------------------");
        baseBrowser b2 = new testBrowser();
        b2.OpenBrowser("Kiwi");
        b2.setBrowser("Comet");
        System.out.println(b2.getBrowser());
        b2.closeBrowser();
        System.out.println("-------------------------called everything in constructor---------------------------------------");
        testBrowser t1 = new testBrowser();
        System.out.println("--------------------------Calling everything in Function----------------------------------------");
t1.testall();
    }
}
class baseBrowser{
    private String browser;

    baseBrowser(){
        System.out.println("Base browser");
    }

    public baseBrowser(String browser) {
        this.browser = browser;
        System.out.println(browser);
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }
    void OpenBrowser(){
        System.out.println("Open default browser : " + browser);
    }
    void OpenBrowser(String browser){

        System.out.println("you chose: "+ browser);
    }
    void closeBrowser(){
        System.out.println("Closing the Browser: "+ browser);
    }
}
class testBrowser extends baseBrowser{
    testBrowser(){
       // super();
        super("Chrome");
        System.out.println("get browser : " + super.getBrowser());
        super.setBrowser("Kiwi");
        super.OpenBrowser();
        super.OpenBrowser("Firefox");
        super.closeBrowser();

    }
    void testall(){

        System.out.println("get browser : " + super.getBrowser());
        super.setBrowser("Comet");
        super.OpenBrowser();
        super.OpenBrowser("Chrome");
        super.closeBrowser();

    }
}
