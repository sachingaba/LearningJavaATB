package JavaPractise.AA_InterviewQuestions;

public class Array_Max_Value {
    public static void main(String[] args) {

        int[] arr = {2,45,7,78,345,323,68,9,343,2};
        int max=0;
        for (int j : arr) {

            if (j > max) {
                max = j;
            }
        }
        System.out.println(max);
    }
}
