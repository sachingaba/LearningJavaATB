package JavaPractise.Array;

public class Array_practise_01 {
    public static void main(String[] args) {


    int[] arr = {32,900,425,56,87,89,90,6574,23,905,12,430,6574,700};
    int max = arr[0];
    int min = arr[0];
    int max2 = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){

                        max = arr[i];

            }


        }
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max2 && arr[i]<max){
                max2 = arr[i];

            }


        }
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(arr.length);
        System.out.println(max2);
    }
}
