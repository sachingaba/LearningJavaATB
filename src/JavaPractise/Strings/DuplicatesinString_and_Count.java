package JavaPractise.Strings;

public class DuplicatesinString_and_Count {
    public static void main(String[] args) {

        String text = "SachinGabaJi";

        char[] ch = text.toCharArray();


        for (int i = 0; i < ch.length; i++) {
            if(ch[i]=='*'){
                continue;
            }else{


            int count = 1;
            for (int j = i+1; j < ch.length; j++) {
                if(ch[i]==ch[j]) {
                    count++;
                    ch[j] = '*';
                }
                }

            if(count>1){
                System.out.println(ch[i] + " Duplicate: " + count);
            }

        }


        }
    }
}
