package ex_15_StringBuffer_StringBuilder_StringFunctions;

public class Lab105_StringFunctions {

    public static void main(String[] args) {


        String name = "Sachin";
        System.out.println(name.compareTo("SACHIN"));

        //String Builder - mutable in nature

        StringBuilder stringBuilder = new StringBuilder("Sachin"); // after reverse it will be deleted
        stringBuilder.reverse();
        System.out.println(stringBuilder); // reverse of sachin is now in stringBuilder

    }
}
