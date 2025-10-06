package ex_14_Strings;

public class Lab104_String_Examples3 {
    public static void main(String[] args) {
        long count = "adad\nds\na\ndasd/".lines().count(); // \n for new line
        System.out.println(count);

        String sach = "sachin";
        char ch1 = sach.charAt(2);
        System.out.println(ch1);
        System.out.println(sach.charAt(3));

        int result = "ABC".compareTo("abc"); // will give difference of ascii code between ABC anc abc
        System.out.println(result); // returns integer

        int index = "java".indexOf("a" );
        System.out.println(index);

        int index2 = "java".lastIndexOf("a");
        System.out.println(index2);

        String s11 = String.join("-", "Java", "Python");
        System.out.println(s11);

        String s12 = "Java".replace("a","o");
        System.out.println(s12);

        boolean b11 = "java".startsWith("Ja");
        System.out.println(b11);

        String s13 = "Java".concat("Mava");
        System.out.println(s13);

    }
}
