package ex_16_Arrays;

public class Lab113_Arrays {
    public static void main(String[] args) {
        int a = 10;
        int[] Sach = {12,15,96,45,69,33,55,57};
        boolean[] is_married_people = {true,false,false};
        System.out.println(Sach.length);
        System.out.println(Sach[4]);
        System.out.println(Sach[0]);

        String sg = "Sachin";
        String[] eachChar = sg.split("");
        for(String s: eachChar){
            System.out.println(s);
        }
        for (int i = 0; i <=eachChar.length-1 ; i++) {
            System.out.println(eachChar[i]);

        }
    }
}
