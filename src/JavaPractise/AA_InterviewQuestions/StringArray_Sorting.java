package JavaPractise.AA_InterviewQuestions;

import java.util.Arrays;

public class StringArray_Sorting {

    public static void main(String[] args) {

        String[] arr = {"Sac", "Delhi", "Agra", "Chandigarh", "Mysore", "Chennai","Sirsa","Jind"};


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j+1 < arr.length; j++) {

                if(arr[j].length()>arr[j+1].length()){
                    String temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }


            }


        }
        System.out.println(Arrays.toString(arr));
    }
}
