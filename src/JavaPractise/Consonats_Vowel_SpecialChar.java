package JavaPractise;

import java.util.Scanner;

public class Consonats_Vowel_SpecialChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.next();
        System.out.println(isVowel(text));

    }


    static String isVowel(String text) {
   char[] ch = text.toCharArray();
   String vowel= " ";
   String cons = "";
   String spec = "";
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]=='a' || ch[i]=='e'|| ch[i]=='u'||ch[i]=='i' || ch[i]=='o'){
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