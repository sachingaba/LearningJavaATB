package ex_13_Functions;

public class Lab088_Simple_Method {
    public static void main(String[] args) {
        no_return_type_function();
        System.out.println("next here");
       String name = return_string_type_function();
        System.out.println(name);
        //Boolean
        boolean statement = boolean_return();
        System.out.println(statement);
        //int
        int age = integer_return();
        System.out.println(age);
    }
    static void no_return_type_function(){
        System.out.println("NO return");
    }
    static String return_string_type_function(){
        System.out.println("return_String");
        return  "Sachin";
    }
    static boolean boolean_return(){
        return true;
    }
    static int integer_return() {
        return 15;
    }
}
