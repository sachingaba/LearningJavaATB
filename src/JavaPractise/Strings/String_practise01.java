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
        System.out.println("\n------------------All char reverse: ");

// all char reverse ---> String to char
        char[] ch1 = text.toCharArray();
        for (int i = ch1.length-1; i>=0; i--) {
            System.out.print(ch1[i]);
        }
        System.out.println("\nFor Each Loop: ");
// for each loop
        for(char ch : ch1){
            System.out.print(ch);
        }
    }
}
