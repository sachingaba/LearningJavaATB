package JavaPractise;

public class Reverse_The_Num {
    public static void main(String[] args) {
        int num = 2854;

        int rev = 0;

        while(num!=0){
            int remain = num%10;
            rev = rev*10+remain;
            num = num/10;
        }
        System.out.println(rev);
    }
}
