package JavaPractise.AA_InterviewQuestions;

public class Print_Number_and_Stars {
    public static void main(String[] args) {
int x =7;

        for (int i = 1; i < x; i++) {
            for (int j = 1; j < x; j++) {
                if(i==j){
                    System.out.print("*");
                }else{
                    System.out.print(j);
                }


            }
            System.out.println("");
        }
    }
}
