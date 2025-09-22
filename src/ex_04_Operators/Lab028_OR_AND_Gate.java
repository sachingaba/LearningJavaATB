package ex_04_Operators;

public class Lab028_OR_AND_Gate {

    public static void main(String[] args) {


        System.out.println(true || false);  // OR gate >> if 1 is true then all is true

        System.out.println(true && false); // AND gate >> if 1 is false then all false
// Example :
        int  b_salary = 12;
        Boolean b = (!(b_salary > 10 || b_salary<5));
        System.out.println(b);


    }
}
