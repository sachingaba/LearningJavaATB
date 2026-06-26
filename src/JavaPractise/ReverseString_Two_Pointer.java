package JavaPractise;

public class ReverseString_Two_Pointer {

    public static void main(String[] args) {

        String text = "Welcome@UST#Sachin";
        int l = 0;
        int r = text.length()-1;
        char[] ch = text.toCharArray();
        while(l<r){
            if(Character.isLetter(ch[l]) && Character.isLetter(ch[r])){
                char temp = ch[l];
                ch[l] = ch[r];
                ch[r]= temp;
                l++;
                r--;
            }else if(!Character.isLetter(ch[l])){
                l++;
            }else{
                r--;
            }
        }
        System.out.println(new String(ch));
    }
}
