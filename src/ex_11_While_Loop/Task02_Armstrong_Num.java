package ex_11_While_Loop;

public class Task02_Armstrong_Num {
    public static void main(String[] args) {

        int num = 153;

        int ognum = num;

        int rev = 0;
        int rem = 0;
        int asn =0;
        while(num!=0){
          rem = num%10;
          rev = rev *10+rem; // reversal
          num= num/10;
           asn = asn+rem*rem*rem;


        }
        System.out.println(rev);
        if(asn==ognum){
            System.out.println("ARM");

        }else {
            System.out.println("No");
        }
    }
}
