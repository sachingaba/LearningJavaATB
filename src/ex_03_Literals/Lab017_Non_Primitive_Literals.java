package ex_03_Literals;

public class Lab017_Non_Primitive_Literals {
    public static void main(String[] args) {
        String name = "Sachin";
        int[] array_of_items = new int[10];
        array_of_items[1] = 5;

        System.out.println(name);
        System.out.println(array_of_items[1]);

        System.out.println("Start ");

        for (int i = 0; i < array_of_items.length; i++) {
            System.out.println( array_of_items[i]);

        }
    }
}
