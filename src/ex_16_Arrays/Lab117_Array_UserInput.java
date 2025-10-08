package ex_16_Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;



public class Lab117_Array_UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array in integer");
//        if (scanner.hasNextInt()){
            int size = scanner.nextInt();
       /* }else {
            System.out.println("Please enter integer value");
            System.exit(0);
        }*/

        String[] arr_value = new String[size];

        for (int i = 0; i < arr_value.length; i++) {
            System.out.println("Enter element --> " + i);
            arr_value[i] = scanner.next();

        }
// print the array
        // sort the array before printing
        Arrays.sort(arr_value);
        for (String arrprint :arr_value ){
            System.out.println(arrprint);

        }
        for (int i = 0; i < arr_value.length; i++) {
            System.out.println(arr_value[i]);


        }


    }
}
