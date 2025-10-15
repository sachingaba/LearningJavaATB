package JavaPractise;

import java.util.Scanner;

public class P02_Factorial_Number {
    public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
               int x = readInt(scan, "Please enter the Number");

               int fact = 1;
                for (int i=x;i>0;i--)
                {
                    fact= fact*i;
                }

                System.out.println(fact);




            }
            static int readInt(Scanner scan , String prompt){
                System.out.println(prompt);
              if (scan.hasNextInt()){
                  return scan.nextInt();
              }else {
                  System.out.println("Please enter num only");
                  System.exit(0);
                  return 0;
              }

            }
        }