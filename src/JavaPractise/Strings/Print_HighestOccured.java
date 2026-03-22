package JavaPractise.Strings;

import javax.security.auth.callback.CallbackHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Print_HighestOccured {
    public static void main(String[] args) {

//For Continous occurence
        String s1 = "Progeammmming";
        int max=0;
char result = ' ';
        for (int i = 0; i < s1.length(); i++) {
            int count=1;
            for (int j = i+1; j <s1.length() ; j++) {
                if(s1.charAt(i)==s1.charAt(j)){
                    count++;
                }

            }
            if(max<count){
                max=count;
                result = s1.charAt(i);
            }

        }
        System.out.println(result + " : count: " + max);
//for all occurences
        String s2 = "Progeammmmingmmgggg";
        int maxy =0;
        char results = ' ';
        char[] ch = s2.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int count=1;
            for (int j = i+1; j <ch.length ; j++) {
                if(ch[i]==ch[j]){
                    count++;
                }

            }
            if(maxy <count){
                maxy =count;
                results = ch[i];
            }

        }
        System.out.println(results + " : count: " + maxy);
// Map uses - no of occurence
        Map<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < ch.length; i++) {
            map.put(ch[i],map.getOrDefault(ch[i],0)+1);


        }
        System.out.println(map);

            System.out.println(Collections.max(map.values()));
        }
    }


