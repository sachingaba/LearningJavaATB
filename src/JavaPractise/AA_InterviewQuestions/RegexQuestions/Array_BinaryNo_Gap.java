package JavaPractise.AA_InterviewQuestions.RegexQuestions;

public class Array_BinaryNo_Gap {
    public static void main(String[] args) {
        int x = 520;

        String binary = Integer.toBinaryString(x);

        System.out.println(binary);
        int max =0;
        int count=0;
        for(char c : binary.toCharArray()){

            if (c=='0'){
                count++;
            }else{
                count=0;
            }
            if(count>max){
                max = count;

            }

        }
        System.out.println(max);
    }
}
