package HackerRank_Practise;

import java.util.Scanner;

public class StringToArray {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        String sc = scanner.nextLine().trim();
        if (sc.isEmpty()) {
            System.out.println(0);
            System.exit(0);
        }

        String clean = sc.replaceAll("[^a-zA-Z\\s]+", " ");
        String[] arr = clean.trim().split("[^a-zA-Z\\s]+");

        int n = arr.length;

        System.out.println(n);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);

        }
    }
}

