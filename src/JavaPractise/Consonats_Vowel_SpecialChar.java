package JavaPractise;

import java.util.List;
import java.util.Scanner;

public class Consonats_Vowel_SpecialChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        System.out.println(isVowel(text));

    }


    static String isVowel(String text) {
   char[] ch = text.toLowerCase().toCharArray();
   List<Character> vowels = List.of('a','e','u','i','o');
   String vowel= " ";
   String cons = "";
   String spec = "";
        for (int i = 0; i < ch.length; i++) {
            if(vowels.contains(ch[i])){
                vowel = vowel+ch[i];
            }else if(Character.isLetter(ch[i])){
                cons = cons+ch[i];
            }
            else{
                spec = spec+ch[i];
            }

        }
        return vowel+cons+spec;
    }
}