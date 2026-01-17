package JavaPractise.Strings;

import java.util.Arrays;
import java.util.Comparator;

public class ConvertTo_TitleCase {
    public static void main(String[] args) {
        String s1 = titleCase("sachin is a good");
        System.out.println(s1);
        String s2 = longestWord1("sachin islpwas a good");
        System.out.println(s2);
        String s3 = longestWord2("sachin islpwas a good programmer");
        System.out.println(s3);

        String s4 = titleCase2("sachin is a good");
        System.out.println("------> " + s4);
    }

    static String titleCase(String str) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sb.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1).toLowerCase())
                    .append(" ");
        }
        //System.out.println(sb);
        return sb.toString();

    }
    static String titleCase2(String str) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
        sb .append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase()).append(" ");

        }
        //System.out.println(sb);
        return sb.toString();

    }

    static String longestWord1(String str) {

        return Arrays.stream(str.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse(" ");

    }

    static String longestWord2(String str) {
        String[] words = str.split(" ");
        String longest = " ";
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (longest.length() < word.length()) {
                longest = word;
            }

        }
       // System.out.println(longest);
        return longest;
    }
}
