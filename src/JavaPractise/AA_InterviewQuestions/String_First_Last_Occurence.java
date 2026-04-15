package JavaPractise.AA_InterviewQuestions;

public class String_First_Last_Occurence {
    public static void main(String[] args) {
        String s1 = "bamazonaanazzz";

        int first = 0;
        int last = s1.lastIndexOf('a');

        System.out.println("First Index:" + s1.indexOf('a'));

        for (int i = 0; i < s1.length(); i++) {

                if(s1.charAt(i)=='a'){
                    first = i;
                break;
                }
            }
        System.out.println(first + " " + last);
        }
    }
