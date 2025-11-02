package Exercises;

public class Task38_While_Loop_Table_of {
    public static void main(String[] args) {

        int i=1;
        int table = 7;
        int x ;

        while(i<=10){
           x =  table*i;
            System.out.println(table + " * " + i + " = " + x);
            i++;
        }
    }
}
