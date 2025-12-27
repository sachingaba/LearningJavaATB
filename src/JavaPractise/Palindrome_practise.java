package JavaPractise;

public class Palindrome_practise {
    public static void main(String[] args) {
        String s1 = "radar";
        String rev ="";

        for (int i = s1.length()-1;i>=0; i--) {
            rev = rev+s1.charAt(i);


        }
        System.out.println(rev);

        if(rev.equalsIgnoreCase(s1)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }

    }

}
