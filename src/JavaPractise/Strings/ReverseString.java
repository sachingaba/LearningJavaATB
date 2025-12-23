package JavaPractise.Strings;

public class ReverseString {
    public static void main(String[] args) {
        String S1 = "hello my name is SachiN";
        String[] s2 = S1.split(" ");

        System.out.println("-------------reverse of String array----------------- \n");
        for (int i = s2.length-1; i >=0; i--) {
            System.out.print(s2[i] + " ");


            }
        System.out.println("");
        // reverse whole string with char
        System.out.println("-------------reverse of String array with char----------------- \n");
        char[] c1 = S1.toCharArray();
        System.out.println("Array length: " + c1.length);
        for (int j = c1.length-1; j >=0 ; j--) {
            System.out.print(" "+ c1[j]);

        }
        System.out.println("\n-------------reverse of String----------------- \n");
        String s3 = "hello";
        System.out.println("\n" + s3.length());
        for (int i = s3.length()-1; i >=0; i--) {
            System.out.println(s3.charAt(i) + " : - Postion string: "+ i);

        }
    }
}
