package ex_27_Exceptions;

public class Lab160_Try_Catch {
    public static void main(String[] args) {
        String s1 = null;
        try {
            s1.trim();
        } catch (Exception e) {
            System.out.println("Error,  NUll is not allowed to be trimmed : " + e.getMessage());
        }


    }
}
