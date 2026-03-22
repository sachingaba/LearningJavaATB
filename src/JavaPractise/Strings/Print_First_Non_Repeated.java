package JavaPractise.Strings;

public class Print_First_Non_Repeated {
    public static void main(String[] args) {
        String s1= "sooftwares";

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);

          if(ch!=' ' && s1.indexOf(ch)==s1.lastIndexOf(ch)){
              System.out.println("here it is : " + ch);
              break;
          }

        }
    }
}
