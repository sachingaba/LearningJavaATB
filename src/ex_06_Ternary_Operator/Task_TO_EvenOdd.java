package ex_06_Ternary_Operator;

public class Task_TO_EvenOdd {
    public static void main(String[] args) {
        int x= 12;
        int y = x%2;

        String result = y>0? "Odd" : "Even";
        System.out.println(result);
    }
}
