package JavaPractise.AA_InterviewQuestions.Java_Streams;

import java.util.*;
import java.util.stream.Collectors;

public class Map_Sort_Desc {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        LinkedHashMap<String, Integer> lmap = new LinkedHashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        Map<String, Integer> Treemap = new TreeMap<>(map);
        System.out.println("Tree: "+Treemap);

        Map<String, Integer> rev = map.entrySet()
                .stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new


                ));
        System.out.println(rev);
    }
}
