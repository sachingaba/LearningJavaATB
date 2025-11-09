package ex_27_Exceptions;

public class Lab157_Exceptions {
    public static void main(String[] args) {
        System.out.println("Start of the progrma");

        String ip = args[0]; // ArrayIndexOutOfBoundsException  -- if not provides from command line
        int aa = Integer.parseInt(ip); //NumberFormatException -- if text is given and not int
        int b = 100/aa; // ArithmeticException -- if user enters 0
        System.out.println(b);


        System.out.println("End of the program");
    }
}
