package ex_30_Collection_Framework.CF_04_MAP;

import java.util.*;

public class Lab194_Real2 {
    public static void main(String[] args) {

        Map<String, String> env = new HashMap<>();
        env.put("prod","prod.intercellworld.com");
        env.put("test","test.intercellworld.com");

        System.out.println(env);

        Map<String, String> Credentials = new HashMap<>();
        Credentials.put("username","prod2");
        Credentials.put("pass","admin@123");

        System.out.println(Credentials);
String url = Credentials.get("username");
        System.out.println( url);





    }
}
