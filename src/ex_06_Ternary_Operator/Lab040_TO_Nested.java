package ex_06_Ternary_Operator;


public class Lab040_TO_Nested {

    // Nested Ternary
// result = condition1 ? expression1 : (condition2 ? expression2 : expression3);
    public static void main(String[] args) {
        int age = 21;
        String result = age>18 ? (age>25? "yes": "Go but No Drink") : "No";
        System.out.println(result);
    }
}
