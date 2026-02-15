package JavaPractise.AA_InterviewQuestions;
import java.util.*;
public class ArrayList_Remove_Duplicates {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(List.of(22,33,44,11,2,4,55,66,77,33,22,10,23,54,1,44));
        ArrayList<Integer> arr1 = new ArrayList<>(List.of(22,33,44,11,2,4,55,66,77,33,22,10,23,54,1,44));

        for(int i=0;i<arr.size();i++){
            int count =1;
            for(int j=i+1;j<arr.size();j++){
                if(Objects.equals(arr.get(i), arr.get(j))){
                    count++;
                    arr.remove(j);
                }
            }
            if(count>1){
                System.out.println(arr.get(i));

            }
        }
        System.out.println(arr);

        HashSet<Integer> h1 = new HashSet<>(arr1);

        System.out.println(h1);















    }
}
