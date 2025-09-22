package ex_04_Operators;

public class Lab024_Concat_Plus_Interview {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println(x + y); // Int --> adds

        String f_name = "sachin";
        String l_name = "gaba";

        System.out.println(f_name + l_name + x + y); // first string then it will concat all

        System.out.println(x + y + f_name + l_name); // first integer , it will add then concat string
        System.out.println(x + f_name + y + l_name); // concat because -- string + int

        //bodmas  will solve bracket so add in bracket




    }
    }
