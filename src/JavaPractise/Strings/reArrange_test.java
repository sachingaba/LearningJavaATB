package JavaPractise.Strings;

import java.util.ArrayList;
import java.util.List;

public class reArrange_test {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online
    public static void main(String[] args) {

        String Input = "-1,4,3,-4,-3,5,1,2,-2";


        String[] inputs = Input.split(",");
//int[] arr1 = new int[]{Integer.parseInt(Input)};
        Integer[] arr = new Integer[inputs.length];

        StringBuilder sneg = new StringBuilder();
        StringBuilder spos = new StringBuilder();


        for (int i = 0; i < inputs.length; i++) {

            arr[i] = Integer.parseInt(inputs[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                sneg.append(arr[i] + ",");

            } else {
if(i!=arr.length-1){
    spos.append(arr[i] + ",");
}else{
    spos.append(arr[i]);
}


            }


        }
        String arranged = sneg.append(spos).toString();

        System.out.println(arranged);


        List l2 = new ArrayList<>();
        List l1 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {

                l1.add(arr[i]);

            } else {

                l2.add(arr[i]);
            }


        }
        System.out.println(l1);
        System.out.println(l2);
        List l3 = new ArrayList<>();
        l3.addAll(l1);
        l3.addAll(l2);



        String s1 = l3.toString();
        System.out.println("String: " + s1);
    }
}

