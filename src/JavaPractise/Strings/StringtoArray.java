package JavaPractise.Strings;

public class StringtoArray {
    public static void main(String[] args) {
        String s1 = "Sachin Is a good programmer";
  // to conver char into array
    char[] arr =     s1.toCharArray();

    for(char ar : arr)
    {
          System.out.println(ar);
    }

        System.out.println("\n----------------------------");
// to convert words into array
        String[] a =  s1.split(" ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }
// reverse the String words
        System.out.println("----------------------------");
        System.out.println("Reverse of text : ");
        for (int i = a.length-1; i >=0; i--) {
            System.out.print(a[i] + " ");

        }
    }
}
