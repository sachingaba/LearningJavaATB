package ex_06_Ternary_Operator;

public class Task_To_AGE {
    public static void main(String[] args) {
        int age = 35;

        String result = age<18? "Minor" : (age>50 ? "Senior": "Adult");
        System.out.println(result);
    }
}
