package ex_25_Enum;

public class Lab_Enum_Real_Ex
{
    public static void main(String[] args) {
        System.out.println(Locators.page_Input_email.getLocator());
    }
}
enum Locators{
    page_Input_email("Login"),
    page_Input_pass("Password"),
    page_Input_button("Button");

    private String locator;


    public String getLocator() {
        return locator;
    }

    Locators(String locator) {
        this.locator = locator;
    }

}
