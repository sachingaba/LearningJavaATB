package ex_27_Exceptions;

public class Lab161_Arithmetic {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        try {
            int d = 10/a;
        } catch (ArithmeticException e) {  // exact exception if you  know..
            System.out.println("Not allowed");
        }
        catch (Exception e) {
            System.out.println("Not allowed");
        }
        catch(Throwable e){
            System.out.println("Not allowed");
        }


    }
}
