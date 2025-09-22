package ex_04_Operators;

public class Lab033_Short_char_Interview {

    public static void main(String[] args) {
        short s = 10;
        char c = 'A'; // ASCII CODE -- 65
        char d = 'S';  // SS or SSK cant be char.. only in single digits

        System.out.println(s+c+d);
        System.out.println("ASCII Code of S is " + (s+c+d-c-s));
    }
}
