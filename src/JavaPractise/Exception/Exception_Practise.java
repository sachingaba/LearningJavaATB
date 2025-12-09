package JavaPractise.Exception;

public class Exception_Practise {
    public static void main(String[] args) {
        int a = 10;
        int b=0;

        try {
            int c= a/b;
        } catch (Exception e) {
            System.out.println("Error function: " + e.getMessage());
        }

    }
}
