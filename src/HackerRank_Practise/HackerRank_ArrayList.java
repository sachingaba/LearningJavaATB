package HackerRank_Practise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HackerRank_ArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<List> lists = new ArrayList<>();
        System.out.println("Enter num of lists:");
        int numofList = scanner.nextInt();

        for (int i = 0; i < numofList; i++) {
            System.out.println("Enter Size of list : " + i);
            int d = scanner.nextInt();
            List<Integer> list = new ArrayList<>(d);
            for (int j = 0; j < d; j++) {
                System.out.println("Enter element: " + j);
                list.add(scanner.nextInt());

            }
            lists.add(list);
        }

        System.out.println(lists);
        System.out.println("enter queries: ");
        int inputs = scanner.nextInt();
        for (int i = 1; i <= inputs; i++) {
            try {
                System.out.println(lists.get(scanner.nextInt()).get(scanner.nextInt()));
            } catch (Exception e) {
                System.out.println("null");
            }

           }



        /* 5
        5 41 77 74 22 44
        1 12
        4 37 34 36 52
        0
        3 20 22 33

        5
        1 3
        3 4
        3 1
        4 3
        5 5*/
    }
}
