package JavaPractise.AA_InterviewQuestions;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class String_Find_SecondSmallest_Digit {
    public static void main(String[] args) {

        String s1 = "Claude24375169laudec";

        char[] ch = s1.toCharArray();

        List<Integer> pq = new LinkedList<>();


        for(char c:ch){

            if(Character.isDigit(c)){

                    pq.add(Integer.parseInt(String.valueOf(c)));

                }


            }
            System.out.println(pq);
        int max =pq.getFirst();
        int max2 =pq.getFirst();
        for (int i = 0; i < pq.size(); i++) {
            if(pq.get(i)<max){
                max2 = max;
                max=pq.get(i);

            }
        }
        System.out.println(max + "--2-- " + max2);
        }


    }

