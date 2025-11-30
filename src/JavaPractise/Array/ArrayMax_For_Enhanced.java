package JavaPractise.Array;

public class ArrayMax_For_Enhanced {
    public static void main(String[] args) {
        int[] array = {25,14,65,89,56,54,6,12,2,585,157,12,44,736};
        int max = array[0];
        int max2 = array[0];
        for(int arr : array){
            if(arr>max){

                max = arr;
            }


        }
        System.out.println(max);

        for(int arr1 : array){
            if(arr1> max2 && arr1<max){
                max2 = arr1;
            }
        }
        System.out.println(max2);
    }
}
