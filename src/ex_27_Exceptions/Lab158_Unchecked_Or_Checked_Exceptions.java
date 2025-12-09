package ex_27_Exceptions;

public class Lab158_Unchecked_Or_Checked_Exceptions {
    public static void main(String[] args) {
        int a =10;
        int b = 10;
       int c = b/a; //ArithmeticException -- Unchecked Exceptions
        System.out.println(c);

        // Null-Pointer Exception
        String s = null;
        s.trim(); //NullPointerException -- null can't be trimmed
    }
}
