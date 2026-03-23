package JavaPractise.AA_InterviewQuestions;

public class Number_Odd_Even_Without_Modulous {
    public static void main(String[] args) {
        int x = 20;

        if ((x & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("ODD");
        }

        if (x - ((x / 2) * x) == 0) {
            System.out.println("Even");

        } else {
            System.out.println("ODD");
        }

    }
}