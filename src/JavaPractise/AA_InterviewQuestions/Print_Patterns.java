package JavaPractise.AA_InterviewQuestions;

public class Print_Patterns {
    public static void main(String[] args) {
//        *****
//        *   *
//        *   *
//        *   *
//        *****

        int x = 5;

        for (int i = 0; i < x; i++) {
            if (i > 0 && i < x - 1) {
                for (int j = 0; j < x; j++) {
                    if (j == 0|| j==x-1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }
            } else {
                for (int j = 0; j < x; j++) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }

    }
}
