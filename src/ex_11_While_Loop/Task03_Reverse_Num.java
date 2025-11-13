package ex_11_While_Loop;

public class Task03_Reverse_Num {

    public static void main(String[] args) {

        int num = 452;

        int rev = 0;

        int rem =0;
        while(num>0){
            rem = num%10;
            rev = rev*10+rem;
            num = num/10;

        }
        System.out.println(rev);
    }
}
