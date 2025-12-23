package JavaPractise.Strings;

public class String_practise01 {
    public static void main(String[] args) {
        String text = "My name is sachin";

        String[] newtext = text.split(" ");


// String array
        for (int i = 0; i < newtext.length; i++) {
            System.out.println(newtext[i]);
        }
//String reverse
        System.out.println(newtext.length-1);
        for (int i = (newtext.length-1); i >=0 ; i--) {
            System.out.print(newtext[i] + " ");

        }
    }
}
