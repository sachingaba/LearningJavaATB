package ex_25_Enum;

public class Lab151_Enum {
    public static void main(String[] args) {
        System.out.println(day.Monday);
        // can be stored in separate files as well
        System.out.println(Days.Tuesday); // here Days Enum file
    }

}
enum day{
    Monday,Tuesday,Wednesday,Thursday, friday, saturday, sunday
}

