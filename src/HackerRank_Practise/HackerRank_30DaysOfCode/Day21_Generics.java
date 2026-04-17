package HackerRank_Practise.HackerRank_30DaysOfCode;
import java.util.*;

 class Day21_Generics {

        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the Size:");
            int n = scanner.nextInt();
            Integer[] intArray = new Integer[n];
            for (int i = 0; i < n; i++) {
                intArray[i] = scanner.nextInt();
            }
            System.out.println("Enter the Size:");
            n = scanner.nextInt();
            String[] stringArray = new String[n];
            for (int i = 0; i < n; i++) {
                stringArray[i] = scanner.next();
            }

            Printer<Integer> intPrinter = new Printer<>();
            Printer<String> stringPrinter = new Printer<>();
            intPrinter.printArray( intArray  );
            stringPrinter.printArray( stringArray );
            if(Printer.class.getDeclaredMethods().length > 1){
                System.out.println("The Printer class should only have 1 method named printArray.");
            }
        }
    }
   class Printer <T> {
    // Write your code here
    void printArray(Object[] o){
        for(Object a:o){
            System.out.println(a);
        }
    }

}

