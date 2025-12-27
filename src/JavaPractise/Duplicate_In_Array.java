package JavaPractise;

public class Duplicate_In_Array {
    public static void main(String[] args) {
        int[] arr = {121, 56, 11, 54, 12, 9, 9, 36, 63, 464, 89, 4, 11, 6, 0, 0,9, 36};
int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[i] == arr[j + 1]) {
                    count++;
                    System.out.println("duplicate: " + arr[i] + " count:  " + count);


                }



            }

            count = 1;



        }

    }
}
