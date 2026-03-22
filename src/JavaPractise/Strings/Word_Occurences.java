package JavaPractise.Strings;

import java.util.*;

public class Word_Occurences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         occCheck("hello my name is sachin hello my na hello", "hello");
        System.out.println("Enter your line and word");

countCheck(scanner.nextLine(),scanner.next());

    }

    static void occCheck(String text , String word){
        String[] s1 = text.toLowerCase().split(" ");

int count =0;
        for (int i = 0; i < s1.length; i++) {
            if(word.equalsIgnoreCase(s1[i])){
                count++;


            }


        }
        System.out.println("Word: " + word + " " + count);

    }

    static void countCheck(String text,String word){
String[] arr = text.split(" ");
        Map<String , Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            map.put(arr[i], map.getOrDefault(arr[i],0)+1);

        }
        System.out.println(map.get(word));


    }
}
