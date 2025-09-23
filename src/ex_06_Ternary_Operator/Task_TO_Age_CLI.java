package ex_06_Ternary_Operator;

public class Task_TO_Age_CLI {

    //command Line Inputs

    public static void main(String[] args) {

        String Input1 = args[0];
        //String Input2 = args[1];
        //String Input3 = args[2];
        System.out.println("age is " + Input1);
        System.out.println(Input1 instanceof String); // string test

        //java: incompatible types: java.lang.String cannot be converted to int
       // ---> //int age_int = (int)Input1;

        //String-Input --> need to be converted to Int

        int age_int = Integer.parseInt(Input1);


       String result = (age_int < 18) ? "Minor" : ((age_int > 50) ? "Senior" : "Adult");
       System.out.println(result);

    }
}
