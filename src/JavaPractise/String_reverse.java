package JavaPractise;

public class String_reverse {
    public static void main(String[] args) {
        String sam = "Sachin";

        StringBuilder mas = new StringBuilder(sam);
        mas.reverse();

        System.out.println(mas);

        String sam1 = mas.toString();
        System.out.println(sam1);
    }
}
