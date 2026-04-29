package JavaPractise.AA_InterviewQuestions;

public class Array_Search_Element_in_Array {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int n = 34;
        int[] arr = {23, 5, 56, 76, 434, 89, 34, 97, 23};

        getIndex(arr, n);
    }

    static void getIndex(int[] arr, int n) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == n) {
                System.out.println(i);
                index++;
            }

        }
        if (index == 0) {
            System.out.println("Not found");
        }
    }
}
