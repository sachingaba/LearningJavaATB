package JavaPractise.Enum;

import java.util.Scanner;

public class enum_Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Severity : ");
        String UserInput = sc.nextLine().toUpperCase();
        System.out.println(UserInput + " selected");
        if (UserInput.equals("HIGH") || UserInput.equals("LOW") || UserInput.equals("MEDIUM") || UserInput.equals("URGENT")) {
            level selectedlevel = level.valueOf(UserInput);

            System.out.println("You selected: " + selectedlevel);

            if (selectedlevel == level.HIGH) {
                System.out.println("take actions : High severity");
            } else if (selectedlevel == level.LOW) {
                System.out.println("take actions : High severity");
            } else if (selectedlevel == level.MEDIUM) {
                System.out.println("take actions : medium severity");
            } else if (selectedlevel == level.URGENT) {
                System.out.println("Stop everything and solve : Urgent severity");
            } else {
                System.out.println("Please enter properly");
            }


        } else {
            System.out.println("Please enter only  LOW,MEDIUM,HIGH,URGENT");
        }
    }

    enum level {
        LOW, MEDIUM, HIGH, URGENT
    }
}

