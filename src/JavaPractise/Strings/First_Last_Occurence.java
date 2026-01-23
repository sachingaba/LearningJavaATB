package JavaPractise.Strings;

public class First_Last_Occurence {
    public static void main(String[] args) {
        String s1 = "abamazonaaahgfd";

        char[] ch = s1.toCharArray();

        for (int i = 0; i <= ch.length; i++) {
            System.out.println(ch[i]+ " :"+ i );
            if(ch[i]=='a'){
                System.out.println("First occurence at : "+ i);
                break;
            }

        }
        int index = 1;
        for (int i =0 ; i < ch.length; i++) {

            if(ch[i]=='a'){

                index =i;
            }

        }
        System.out.println("last occurence: " + index);
    }


}
