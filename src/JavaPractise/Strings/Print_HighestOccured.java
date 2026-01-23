package JavaPractise.Strings;

public class Print_HighestOccured {
    public static void main(String[] args) {


        String s1 = "Progeammmming";
        int max=0;
char result = ' ';
        for (int i = 0; i < s1.length(); i++) {
            int count=0;
            for (int j = i+1; j <s1.length() ; j++) {
                if(s1.charAt(i)==s1.charAt(j)){
                    count++;
                }

            }
            if(max<count){
                max=count;
                result = s1.charAt(i);
            }

        }
        System.out.println(result + " : count: " + max);


    }

}
