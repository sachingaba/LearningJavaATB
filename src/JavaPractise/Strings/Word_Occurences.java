package JavaPractise.Strings;

public class Word_Occurences {
    public static void main(String[] args) {
         occCheck("hello my name is sachin hello my na hello", "hello");


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
}
