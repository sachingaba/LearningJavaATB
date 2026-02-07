package HackerRank_Practise;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaInstanceOf {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a =0;
        int b=0;
        int c=0;


        ArrayList<Object> list = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            String s = sc.next();
            if(s.equals("Student")){
                list.add(new Student());

            }else if(s.equals("Rockstar")){
                list.add(new Rockstar());
            }
            else  if(s.equals("Hacker")){
                list.add(new Hacker());
            }
            else{
                break;
            }
        }
        for (int i = 0; i < t; i++) {
            if(  list.get(i)instanceof Student){
                a++;
            }
            if(  list.get(i)instanceof Rockstar){
                b++;
            }
            if(  list.get(i)instanceof Hacker){
                c++;
            }

        }
        System.out.println(a +" "+ b +" "+ c +" ");
    }
}
class Student{}
class Rockstar{}
class Hacker{}