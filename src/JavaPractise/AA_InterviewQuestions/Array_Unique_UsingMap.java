package JavaPractise.AA_InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class Array_Unique_UsingMap {
    public static void main(String[] args) {

        int[] mon ={1,1,2,2,3,4,5,5,6,6,7,7,1};
//        for(int i=0;i<mon.length;i++){
//            if(mon[i]<0){
//                continue;
//            }
//            int count=1;
//            for(int j=i+1;j<mon.length;j++){
//                if(mon[i]==mon[j]){
//                    count++;
//                    mon[j]=-1;
//                }
//            }
//            if(count==1){
//                System.out.println(mon[i]);
//            }
//
//
//        }

        Map<Integer,Integer> m1 = new HashMap<>();
        for(int mo:mon){
            m1.put(mo,m1.getOrDefault(mo,0)+1);
        }
        System.out.println(m1);

        for (Map.Entry<Integer,Integer> entry: m1.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
            }

        }
    }
}
