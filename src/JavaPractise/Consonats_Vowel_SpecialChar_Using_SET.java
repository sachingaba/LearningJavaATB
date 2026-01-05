package JavaPractise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Consonats_Vowel_SpecialChar_Using_SET {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println(reArrange(scanner,"Please enter your text: "));


    }
    public static String reArrange(Scanner scan,String prompt){
        System.out.println(prompt);
        String text = scan.next();
        List<Character> vowel = new ArrayList<>();
        List<Character> cons = new ArrayList<>();
        List<Character> spec = new ArrayList<>();
        List<Character> num = new ArrayList<>();
        Set<Character> vset = Set.of('A','E','I','O','U','a','e','i','o','u');

        for(char ch: text.toCharArray()){
            if(vset.contains(ch)){
                vowel.add(ch);
            }
            else if(Character.isLetter(ch)){
                cons.add(ch);
            }else if(Character.isDigit(ch)){
                num.add(ch);
            }
            else {
                spec.add(ch);
            }
        }

        StringBuilder result = new StringBuilder();
        for(char c: vowel){
            result.append(c);
        }
        for(char c: num){
            result.append(c);
        }
        for(char c: cons){
            result.append(c);
        }
        for(char c: spec){
            result.append(c);
        }
        System.out.println(result);

return result.toString();
    }
}
