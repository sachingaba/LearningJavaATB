package ex_27_Exceptions;

public class Lab162_Multiple_Exceptions {
    public static void main(String[] args) {
        int a = 0;
        String s = null;
        try {
            int b= 10/a;

            s.trim();
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
