package HackerRank_Practise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Java_MaP {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        Map<String,String> m1 = new HashMap<>();

        while(n>0){
            String key = scanner.nextLine();
            String value = scanner.next();
            scanner.nextLine();
            m1.put(key,value);
            n--;
        }
        while(scanner.hasNext()){


            String outkeys = scanner.nextLine();


            if(m1.get(outkeys)!=null){
                System.out.println(outkeys + "="+m1.get(outkeys));
            }else{
                System.out.println("Not found");
            }


        }

    }
}
