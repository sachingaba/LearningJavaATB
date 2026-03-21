package JavaPractise;

public class String_reverse {
    public static void main(String[] args) {
        String sam = "Sachin is a good boy";

        StringBuilder mas = new StringBuilder(sam);
        mas.reverse();

        System.out.println(mas);

        String sam1 = mas.toString();
        System.out.println(sam1);

        StringBuilder sb = new StringBuilder();
        for(String s:sam.split(" ")){
            sb = new StringBuilder(s + " " + sb);

        }
        System.out.println(sb);
    }
}
