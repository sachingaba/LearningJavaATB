package JavaPractise.Strings;

import java.util.Locale;
import java.util.Scanner;

public class StringFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //String scs = sc.next();
        String skm = "Hello my hello \n kj \n sdfdgs \n sdgsdg  \n dwewr\n";
      long count =  skm.lines().count();
        System.out.println(count);

        System.out.println(skm.charAt(1));
        System.out.println(skm.length());
        System.out.println(skm.toUpperCase());
        String luv = skm.replace("hello", "love");
        System.out.println(luv.concat("king of the world"));
        System.out.println("--------Concat and Replace------");
        String luv1 = luv.concat("king of the world").replace("\n kj \n sdfdgs \n sdgsdg  \n dwewr\n", "you are the best\n Sachin - The ");
        System.out.println(luv1);

        System.out.println(luv1.indexOf("n"));
        System.out.println(luv1.charAt(45));
        String sk = String.join("-",luv1,"\n From Gurleen");
        System.out.println(sk);
    }

}
