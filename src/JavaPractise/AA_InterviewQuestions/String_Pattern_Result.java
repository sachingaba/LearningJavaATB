package JavaPractise.AA_InterviewQuestions;

public class String_Pattern_Result {

    public static void main(String[] args) {

        String s1 = "A1n2ki2a0aa1";

        //Output: Annkikiaa
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        char[] ch = s1.toCharArray();
        for (char c : ch) {

            if (Character.isLetter(c)) {
                sb.append(c);
            } else {
                int num = Integer.parseInt(String.valueOf(c));
                // System.out.println(num);
                for (int j = 1; j <= num; j++) {
                    result.append(sb);

                }
                sb.setLength(0);
            }

        }

        System.out.println(result);
    }
}
