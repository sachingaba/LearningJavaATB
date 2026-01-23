package JavaPractise.Strings;

public class Print_First_Non_Repeated {
    public static void main(String[] args) {
        String s1= "softwares";

        for (int i = 0; i < s1.length(); i++) {
            int count=0;
            for (int j = i+1; j < s1.length(); j++) {
                if(s1.charAt(i)==s1.charAt(j)){
                    count++;
                }

            }
            if(count==0){
                System.out.println("First NON-Repeated: "+s1.charAt(i));
                break;
            }

        }
    }
}
