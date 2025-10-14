package Exercises;

public class Task10_2nd_Max_For_Each_Loop {
    public static void main(String[] args) {
        int[] array = {25, 65, 65, 89, 54, 54, 6, 12, 798, 798, 12, 44, 36};

        int highest = 0;
        int secondHighest = 0;

        for (int num: array) {
            if (num>highest){
                secondHighest = highest;
                highest = num;
            }else if(num>secondHighest && num !=highest){

                secondHighest = num;
            }
        }
        System.out.println(highest);
        System.out.println(secondHighest);
    }
}
