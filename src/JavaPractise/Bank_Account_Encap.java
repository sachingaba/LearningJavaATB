package JavaPractise;

import java.util.Scanner;

public class Bank_Account_Encap {
    public static void main(String[] args) {
        BankAct b1 = new BankAct(1000);
      //  System.out.println("Initial balance: "+ b1.getBal());
        Scanner scan = new Scanner(System.in);

        int deposit = deposit(scan,"Enter deposit Value");
        b1.setBal(b1.getBal()+deposit);
        System.out.println("Your updated balance after deposit: "+ b1.getBal());
        int with = withdraw(scan,"Enter withdrawal amount");

        while (with>b1.getBal()){
            System.out.println("Insufficient amount . Enter lower ");
            with = scan.nextInt();
        }
            b1.setBal(b1.getBal()-with);


        System.out.println("YOur balance after withdrwal is : " + b1.getBal());


    }

    static int deposit(Scanner scan, String prompt){
        System.out.println(prompt);
        while(!scan.hasNextInt() || scan.nextInt()<=0){
            System.out.println("Enter proper values");
            scan.nextInt();
        }
        return scan.nextInt();
    }
    static int withdraw(Scanner scan, String prompt){
        System.out.println(prompt);
        if(!scan.hasNextInt()){
            System.out.println("Enter proper values");
        }
        return scan.nextInt();
    }
}

class BankAct{
    private double bal;




    public BankAct(double bal) {
        this.bal = bal;
    }

    public double getBal() {
        return bal;
    }

    public void setBal(double bal) {
        this.bal = bal;
    }
}
