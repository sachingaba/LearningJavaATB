package HackerRank_Practise;

import java.util.*;

public class Java_HashSet {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        Map<String,String> m1 = new HashMap<>();
        Set<Map<String,String>> s1 = new HashSet<>();
        while(T>0){
            m1.put(scanner.next(), scanner.next());

            s1.add(m1);
            System.out.println(s1.size());
            T--;
        }

    }


}

