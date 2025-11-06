package ex_20_Polymorphism.Method_overloading;

public class WebUiAutomation {
    public static void main(String[] args) {
        browser b1 = new browser();
        b1.StartBrowser();
        b1.StartBrowser("Chrome");
    }
}

class browser{
    void StartBrowser(){
        System.out.println("Default Browser");
    }
void StartBrowser(String Browser){
    System.out.println("browser is opening " + Browser);
}
}