package ex_23_Super_Abstraction.Super_keyword;



public class Lab139_Super {
    public static void main(String[] args) {
        TestCase t1 = new TestCase();
        t1.tc1();
        t1.setBrowser("kiwi");
        t1.CloseBrowser();
        System.out.println(t1.getBrowser());


}
static class baseClass {
    private String browser;
// Default Constructor

    public baseClass() {
        System.out.println("Default Constructor");
    }
// Parameterized Constructor

    public baseClass(String browser) {
        this.browser = browser;
    }

    //Getter and setter
    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }
// Normal function

    void OpenBrowser() {
        System.out.println("opening Default Browser");

    }

    // Parameterized Function - Method Overloading (Same name but different Arguments
    void OpenBrowser(String browser) {
        System.out.println("opening Default Browser: " + browser);

    }

    void CloseBrowser() {
        System.out.println("Closing Default Browser: " + browser);

    }
}

static class TestCase extends baseClass{

void tc1(){}

     TestCase(){
    //super(); // Only 1 constructor can be called .. either default or para
    super("Chrome");
    super.getBrowser();
    super.setBrowser("Chrome");
    super.OpenBrowser();
    super.OpenBrowser("Firefox");
    super.CloseBrowser();
         System.out.println(super.getBrowser());

  }
}

}