package ex_15_StringBuffer_StringBuilder_StringFunctions;

public class Lab108_StringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Sachin");

        stringBuilder.append("Gaba");
        System.out.println(stringBuilder);// Single string will come as they are mutable
        stringBuilder.append(123); // can append int, long , float , double also
        System.out.println("Append func -> " +  stringBuilder);

        stringBuilder.replace(10,13 , "programmer");
        System.out.println("Replace function -> " + stringBuilder);


        stringBuilder.reverse();
        System.out.println("reverse func -> " + stringBuilder);



    }
}
