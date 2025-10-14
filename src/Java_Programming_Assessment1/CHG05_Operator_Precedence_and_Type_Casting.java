package Java_Programming_Assessment1;

public class CHG05_Operator_Precedence_and_Type_Casting {

    public static void main(String[] args) {
        int course = 10;
        float tax = 3.5f;

        int total = 2*course+ (int)tax;
        System.out.println("Expression result: " + total);

        int total1 = course + (int) tax;
        System.out.println("Explicit casting: "+ total1);
        //Expression result: 23 Implicit casting: 13.5 Explicit casting: 13

        float total2 = course+tax;
        System.out.println("Implicit casting: " + total2);

    }
}
