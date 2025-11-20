package JavaPractise;

public class Multi_Exception_Handling {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;

        int div = 0;
        try {
            div = x/y;
        } catch (Exception e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }


        int[] a ={22,4,4,5,66,7};

        try {
            System.out.println(a[11]);
        } catch (Exception e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());


        }
        try {
        int a1 = Integer.parseInt(args[0]);
        int b1 = 45;

            int c1 = a1/b1;
           // System.out.println(c1);
        } catch (Exception e) {
            System.out.println("NumberFormatException:  Invalid number format  --> " + e.getMessage());
            //throw new RuntimeException(e);
        }finally {
            System.out.println("all done");
        }
    }
}
