package JavaPractise.Strings;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.Scanner;

public class StringInput_to_removeDuplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        for (int i = 0; i < x; i++) {
            if(scanner.hasNextLine()) {
                String s1 = scanner.nextLine();
                convert(s1);
                System.out.println(convert(s1));
            }
        }

        scanner.close();

    }
    static String convert(String s1){
        // System.out.println("Enter: ");
        //  String s1 = scanner.next().toLowerCase();
        // System.out.println(s1);
        String[] arr = s1.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[j].isEmpty()) {
                continue;
            }
            for (int k = j + 1; k < arr.length - 1; k++) {
                if (arr[j].equalsIgnoreCase(arr[k])) {
                    arr[k] = "";
                }

            }
            sb.append(arr[j]).append(" ");


        }
        //  System.out.println(sb);

        return sb.toString();

    }
}

      /*  Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        for (int i = 0; i < x; i++) {
            System.out.println("Enter: ");
            String s1 = scanner.nextLine().toLowerCase();
            System.out.println(s1);
            String[] arr = s1.split(" ");
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].isEmpty()) {
                    continue;
                }
                for (int k = j + 1; k < arr.length - 1; k++) {
                    if (arr[j].equalsIgnoreCase(arr[k])) {
                        arr[k] = "";
                    }

                }
                sb.append(arr[j]).append(" ");


            }
            System.out.println(sb);


        }

    }*/

