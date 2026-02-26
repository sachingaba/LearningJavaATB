package JavaPractise.AA_InterviewQuestions;

public class Array_Multiplication_except_Self {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");

        int[] arr = {7,2,3,4,5};

        for(int i=0;i<arr.length;i++){
            int mul=1;
            for(int j=0;j<arr.length;j++){
                if(i==j){
                    continue;
                }else{
                    mul= mul*arr[j];
                }

            }
            System.out.println("Multiplication at : "+arr[i] + " = " + mul);
        }
    }
}
