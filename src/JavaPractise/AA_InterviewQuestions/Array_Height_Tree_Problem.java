package JavaPractise.AA_InterviewQuestions;

public class Array_Height_Tree_Problem {
    public static void main(String[] args) {
//        - Heights: 3m, 2m, 5m
//  ❓ How many trees can you see?
//  👉 Write a Java program for the same


        int[] heights = {3, 2, 5, 7, 9, 6, 5, 8};
        int maxHeight = 0;
        int visibleCount = 0;

        for (int height : heights) {
            if (height > maxHeight) {
                visibleCount++;
                maxHeight = height;
            }
        }
        System.out.println(visibleCount);

    }
}
