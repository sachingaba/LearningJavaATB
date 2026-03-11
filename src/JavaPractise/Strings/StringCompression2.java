package JavaPractise.Strings;

public class StringCompression2 {
    public static void main(String[] args) {
        String s1 = "abcdeaabbccddeeaak";
        //output: a1 b1 c1 d1 e1 a2 b2 c2 d2 e2 a2 k1

        char[] ch = s1.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if(ch[i]==' '){
                continue;
            }
            int count=1;
            for (int j = i+1; j <ch.length ; j++) {

                if (ch[i] == ch[j]) {
                    ch[j]=' ';
                    count++;


                }else{
                    break;
                }
            }
            System.out.print(ch[i]+ ""+count+" ");
        }

    }

}
