package JavaPractise;

public class String_First_non_repeated {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");

        String x = "mynameIsSachin";

        char[] arr = x.toCharArray();
        for(char c : x.toCharArray()){

            if(x.indexOf(c)==x.lastIndexOf(c)){
                System.out.println("Start small. Ship something." + c);
                break;
            }
        }

        for(int i = 0;i<arr.length;i++){

            if(Character.isUpperCase(arr[i])){
                arr[i] =    Character.toLowerCase(arr[i]);
            }else{
                arr[i] =    Character.toUpperCase(arr[i]);
            }
        }
        System.out.println(new String(arr));


    }
}
