package ex_16_Arrays;

public class Lab114_Array_Creation {
    public static void main(String[] args) {
        //1st
        int[] marks = {11,15,19,13,56,11,4,65};
        // 2nd
        int[] mark = new int[5];
       // int mark[] = new int[5]; // fixed size

        String[] names = new String[4];
        names[1] = "Sachin";
        names[2] = "hin";
        names[3] = "achin";
        names[0] = "Gaba";
        names[3] = "hi";

        System.out.println(names[3]);
        System.out.println(marks[0]);



    }
}
