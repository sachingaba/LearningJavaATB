package HackerRank_Practise;

import java.util.Scanner;

public class String_DuplicateWords {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        // int x = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        //  for (int i = 0; i < x; i++)
        //  {
        String s1 = scanner.nextLine();
        String[] arr = s1.split(" ");

        for (int j = 0; j < arr.length; j++)
        {
            if (arr[j].equalsIgnoreCase(""))
            {
                continue;
            }
            for (int k = j + 1; k < arr.length; k++)
            {
                if (arr[j].equalsIgnoreCase(arr[k]))
                {
                    arr[k] = "";
                }
            }
            sb.append(arr[j]);
            sb.append(" ");
        }
        System.out.println(sb.toString());
        // }
    }
}


