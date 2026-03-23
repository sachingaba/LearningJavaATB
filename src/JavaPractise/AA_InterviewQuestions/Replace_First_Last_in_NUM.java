package JavaPractise.AA_InterviewQuestions;

public class Replace_First_Last_in_NUM {
    public static void main(String[] args) {

        int num  =  2024;
        String x = String.valueOf(num);
        System.out.println(x.length());
        int og_num = num;
        int first=0;
        int arm =0;
        int digits =0 ;
        while(num!=0){

            first =num%10;
            num = num/10;
            digits++;
        }
        System.out.println(digits);
        int lastDigit = og_num%10;
        System.out.println(first);
        System.out.println(lastDigit);

        int middle =(int) (((og_num-(first*(Math.pow(10,(digits-1))))))-lastDigit)/10;

        System.out.println(middle);

        int newNum = (int)(lastDigit*(Math.pow(10,digits-1))+middle*10+first);


        System.out.println(newNum);
        // System.out.println(Output);
    }
}
