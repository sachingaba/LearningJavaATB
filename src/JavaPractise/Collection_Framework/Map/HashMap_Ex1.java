package JavaPractise.Collection_Framework.Map;

import java.util.HashMap;

public class HashMap_Ex1 {
    public static void main(String[] args) {

        HashMap h1 = new HashMap<>();
        h1.put("Name:", "Sachin");
        h1.put("Age:",34);
        h1.put("Course", "Java");
        h1.put("Roll_num", 4534);
        h1.put(1,null);
        System.out.println(h1);
        System.out.println(h1.containsKey(1));
        System.out.println(h1.containsValue(null));

        System.out.println(h1.get(0));  // returns the value of the key .. null if no suck key is present
        System.out.println(h1.get("Name:"));
        System.out.println(h1.keySet());
        System.out.println(h1.values());
        //convert to string or char
       String s1 =  h1.toString();
        System.out.println(s1);
       char[] ch =  s1.toCharArray();

       String s2 = h1.keySet().toString();
       String[] s3 = h1.keySet().toString().split(" " );
      char[] ch2 = s2.toCharArray();
        System.out.println("");
    /*    for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + " ");
            }
    */
        for (int i = 0; i < ch2.length; i++) {
            System.out.print(ch2[i] +" ");
        }
        System.out.println("\n"+ s3.length);
        for (int i = 0; i < s3.length; i++) {
            System.out.println(s3[i]);
        }
    }
}
