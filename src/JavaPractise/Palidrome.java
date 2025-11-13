package JavaPractise;

public class Palidrome {
    public static void main(String[] args) {
        String na = "naassn";
        int len = na.length();
        System.out.println(len);
String pa = "";
        for (int i = len-1; i >=0 ; i--) {
            pa = pa + na.charAt(i);


        }
        System.out.println(pa);
        if(pa.equalsIgnoreCase(na)){
            System.out.println("palindrome");
        }else{
            System.out.println("not P");
        }
    }
}
